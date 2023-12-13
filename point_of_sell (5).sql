-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Des 2023 pada 22.11
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `point_of_sell`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(11) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `harga_barang` int(255) NOT NULL,
  `stok_barang` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga_barang`, `stok_barang`) VALUES
('B01', 'Buku', 57000, 13),
('B02', 'Correction Tape', 10000, 25),
('B03', 'Gunting', 10000, 15),
('B04', 'Penghapus', 1000, 37),
('B05', 'Pensil', 3000, 39),
('B06', 'Pensil Warna', 16000, 9),
('B07', 'Penggaris', 6000, 13),
('B08', 'Pulpen', 3000, 46),
('B09', 'Spidol Papan Tulis', 10000, 20);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `id_kasir` varchar(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nama_kasir` varchar(255) NOT NULL,
  `no_telpon` varchar(13) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` tinyint(1) NOT NULL,
  `manager` tinyint(1) DEFAULT NULL,
  `log` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `password`, `nama_kasir`, `no_telpon`, `alamat`, `tanggal_lahir`, `jenis_kelamin`, `manager`, `log`) VALUES
('admin', 'admin', 'admin', '-', '-', '2004-03-27', 1, 1, 0),
('K001', '12345678', 'Bangun Panduko Johan', '085921595619', 'Puncangan', '2004-05-12', 1, 0, 0),
('K002', '11223344', 'Muhammad Ilyas', '087733625013', 'Makamhaji', '2004-03-27', 1, 0, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id_member` varchar(11) NOT NULL,
  `nama_member` varchar(255) NOT NULL,
  `no_telpon` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `no_telpon`, `alamat`, `tanggal_lahir`, `jenis_kelamin`) VALUES
('M001', 'Raphael Armado Jose', '089646513759', 'Mahamhaji', '2004-01-09', 1),
('M002', 'Muhammad Farid', '082268597785', 'Mahamhaji', '2004-01-12', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `sales`
--

CREATE TABLE `sales` (
  `id_struk` varchar(11) NOT NULL,
  `tanggal` date NOT NULL,
  `total_keseluruhan` int(255) NOT NULL,
  `id_member` varchar(11) DEFAULT NULL,
  `id_kasir` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `sales`
--

INSERT INTO `sales` (`id_struk`, `tanggal`, `total_keseluruhan`, `id_member`, `id_kasir`) VALUES
('S001', '2023-12-14', 87000, NULL, 'admin'),
('S003', '2023-12-14', 19800, 'M001', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_kasir`);

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indeks untuk tabel `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id_struk`),
  ADD KEY `id_member` (`id_member`,`id_kasir`),
  ADD KEY `id_kasir` (`id_kasir`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`id_kasir`) REFERENCES `kasir` (`id_kasir`),
  ADD CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`id_member`) REFERENCES `member` (`id_member`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

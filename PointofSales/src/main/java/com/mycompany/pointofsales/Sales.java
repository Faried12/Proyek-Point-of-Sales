/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Sales {
    public static void addSales(String idKasir,String idMember,  String idBarang, String jumlah) throws SQLException{
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //declare statement
        Statement statement = connection.createStatement();
        
        //take member ID from database
        String memberID = "";
        String query = "SELECT * FROM member WHERE id_member = '"+idMember+"';";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            memberID = rs.getString("id_member");
        }
        
        //get totalHarga
        String totalHarga = Sales.totalHarga(jumlah, idBarang);
        
        //get date
        LocalDate date = LocalDate.now();
        String tanggal = date.toString();
        
        //check member id
        if (memberID == ""){
            //prepared statement query
            String query2 = "INSERT INTO pembelian (id_barang, id_kasir, jumlah_barang, total_harga, tanggal) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstatement = connection.prepareStatement(query2);
                
            pstatement.setString(1, idBarang);
            pstatement.setString(2, idKasir);
            pstatement.setString(3, jumlah);  
            pstatement.setString(4, totalHarga);
            pstatement.setString(5, tanggal);
            
            //execute querry
            pstatement.executeUpdate();
        }else{
            //prepared statement query
            String query2 = "INSERT INTO pembelian (id_barang, id_kasir, id_member, jumlah_barang, total_harga, tanggal) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstatement = connection.prepareStatement(query2);
                
            pstatement.setString(1, idBarang);
            pstatement.setString(2, idKasir);
            pstatement.setString(3, idMember);
            pstatement.setString(4, jumlah);  
            pstatement.setString(5, totalHarga);
            pstatement.setString(6, tanggal);
            
            //execute querry
            pstatement.executeUpdate();
        }
    }
    public static String totalHarga(String jumlah, String idBarang) throws SQLException{
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //declare statement
        Statement statement = connection.createStatement();
        
        //take harga_barang from database
        String harga = "";
        String query1 = "SELECT * FROM barang WHERE id_barang = '"+idBarang+"';";
        ResultSet rs1 = statement.executeQuery(query1);
        while (rs1.next()) {
            harga = rs1.getString("harga_barang");
        }
        
        //calculate total harga
        int intharga = Integer.parseInt(harga);
        int intjumlah = Integer.parseInt(jumlah);
        int inttotalHarga = intharga * intjumlah;
        String totalHarga = String.valueOf(inttotalHarga);
        return totalHarga;
    }
    public static int checkStock(String idBarang, String jumlah) throws SQLException{
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //declare statement
        Statement statement = connection.createStatement();
        
        //get stock
        String stock = "";
        String query1 = "SELECT * FROM barang WHERE id_barang = '"+idBarang+"';";
        ResultSet rs1 = statement.executeQuery(query1);
        while (rs1.next()) {
            stock = rs1.getString("stok_barang");
        }
        int intstock = Integer.parseInt(stock) -  Integer.parseInt(jumlah);
        if ( intstock > 0){
            String query2 = "UPDATE `barang` SET `stok_barang` = '"+intstock+"' WHERE `barang`.`id_barang` = '"+idBarang+"';";
            statement.execute(query2);
            return 1;
        }
        else{
            return 0;
        }
    }
}

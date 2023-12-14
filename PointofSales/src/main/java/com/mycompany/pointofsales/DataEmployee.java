/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.pointofsales.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DataEmployee {
static void tambah( String id_kasir, String password, String nama_kasir, String no_telpon, String alamat, String tanggal_lahir, String jenis_kelamin) throws IOException{
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String query = "INSERT INTO kasir (id_kasir, password, nama_kasir, no_telpon, alamat, jenis_kelamin) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
                    
            statement.setString(1, id_kasir);
            statement.setString(2, password);
            statement.setString(3, nama_kasir);
            statement.setString(4, no_telpon);
            statement.setString(5, alamat);
            statement.setString(6, tanggal_lahir);
            statement.setString(7, jenis_kelamin);
            
            statement.executeUpdate();
            statement.close();
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void hapus(String id){
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String query = "DELETE FROM kasir WHERE id_kasir = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            
            statement.setString(1, id);
            
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    static void update(String id_kasir, String password, String nama_kasir, String no_telpon, String alamat, String tanggal_lahir, String jenis_kelamin){
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String query = "UPDATE kasir SET password = ?, nama_kasir = ?,no_telpon = ?,alamat= ?, tanggal_lahir = ?, jenis_kelamin = ?,  WHERE id_kasir = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(7, id_kasir);
            statement.setString(1, password);
            statement.setString(2, nama_kasir);
            statement.setString(3, no_telpon);
            statement.setString(4, alamat);
            statement.setString(5, tanggal_lahir);
            statement.setString(6, jenis_kelamin);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }    
}

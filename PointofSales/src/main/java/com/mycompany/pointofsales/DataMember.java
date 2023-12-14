/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;


import com.mycompany.pointofsales.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DataMember {
static void tambah( String id_member, String nama_member, String no_telpon, String alamat, String tanggal_lahir, String jenis_kelamin) throws IOException{
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String query = "INSERT INTO kasir (id_member, nama_member, no_telpon, alamat, jenis_kelamin) VALUES (?, ?, ?, ?, ?,)";
            PreparedStatement statement = connection.prepareStatement(query);
                    
            statement.setString(1, id_member);
            statement.setString(3, nama_member);
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
            String query = "DELETE FROM data_member WHERE id_member = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            
            statement.setString(1, id);
            
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    static void update(String id_member, String nama_member, String no_telpon, String alamat, String tanggal_lahir, String jenis_kelamin){
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String query = "UPDATE data_member SET password = ?, nama_kasir = ?,no_telpon = ?,alamat= ?, tanggal_lahir = ?, jenis_kelamin = ?,  WHERE id_member = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(6, id_member);
            statement.setString(1, nama_member);
            statement.setString(2, no_telpon);
            statement.setString(3, alamat);
            statement.setString(4, tanggal_lahir);
            statement.setString(5, jenis_kelamin);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }    
}
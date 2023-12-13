/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Sales {  
    public static String totalHarga(String jumlah, String idBarang, String member) throws SQLException{
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
        
        
        //take member ID from database
        String memberID = "";
        String query = "SELECT * FROM member WHERE id_member = '"+member+"';";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            memberID = rs.getString("id_member");
        }
        
        if (memberID == ""){
            return String.valueOf(inttotalHarga);
        }else{
            return String.valueOf(inttotalHarga * 90 / 100);
        }

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
    public static void addSales(String total, String member, String kasir ) throws SQLException{
        String id= "";
        
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //declare statement
        Statement statement = connection.createStatement();
        
        try {
            //get id
            id = "S"+ID.take(4);
            ID.replace(4);
        } catch (IOException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //get date
        LocalDate date = LocalDate.now();
        String tanggal = date.toString();
        
        //take member ID from database
        String memberID = "";
        String query = "SELECT * FROM member WHERE id_member = '"+member+"';";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            memberID = rs.getString("id_member");
        }
        
        //check member id
        if (memberID == ""){
            //prepared statement query
            String query2 = "INSERT INTO sales (id_struk, tanggal, total_keseluruhan, id_kasir) VALUES (?, ?, ?, ?)";
            PreparedStatement pstatement = connection.prepareStatement(query2);
                
            pstatement.setString(1, id);
            pstatement.setString(2, tanggal);
            pstatement.setString(3, total);  
            pstatement.setString(4, kasir);
            
            //execute querry
            pstatement.executeUpdate();
        }else{
            //prepared statement query
            String query2 = "INSERT INTO sales (id_struk, tanggal, total_keseluruhan, id_kasir, id_member) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstatement = connection.prepareStatement(query2);
                
            pstatement.setString(1, id);
            pstatement.setString(2, tanggal);
            pstatement.setString(3, total);  
            pstatement.setString(4, kasir);
            pstatement.setString(5, member);
            
            //execute querry
            pstatement.executeUpdate();
        }
    }
}

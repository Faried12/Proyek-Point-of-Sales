/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class PointOfSales {
    public static void addSales(String idKasir,String idMember,  String idBarang, int jumlah) throws SQLException{
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //adding date
        LocalDate date = LocalDate.now();
        String tanggal = date.toString();
        
        //prepared statement querry
        String query = "INSERT INTO pembelian (id_barang, id_kasir, id_member) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        
        
    }
}

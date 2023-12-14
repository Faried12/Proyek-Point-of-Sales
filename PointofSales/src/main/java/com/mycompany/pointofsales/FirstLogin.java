/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

/**
 *
 * @author bangu
 **/

import java.awt.Component;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstLogin {
    // Informasi koneksi database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/point_of_sales";
    private static final String DB_USER = "username_database";
    private static final String DB_PASSWORD = "password_database";

    public static void main(String[] args) {
    
    }
    // Fungsi untuk memvalidasi login dari database
    private static boolean validateLogin(String username, String password) {
        try {
            // Buat koneksi
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Query untuk memeriksa username dan password
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                // Eksekusi query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Jika hasil query tidak kosong, berarti login berhasil
                return resultSet.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}


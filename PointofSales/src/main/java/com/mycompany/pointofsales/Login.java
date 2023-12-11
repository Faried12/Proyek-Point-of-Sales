/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Login {
    public static int check(String username, String password) throws SQLException{
        //database connection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        
        //declare statement
        Statement statement = connection.createStatement();
        
        //take harga_barang from database
        String user = "";
        String pass = "";
        String query1 = "SELECT * FROM kasir WHERE id_kasir = '"+username+"';";
        ResultSet rs1 = statement.executeQuery(query1);
        while (rs1.next()) {
            user = rs1.getString("id_kasir");
            pass = rs1.getString("password");
        }
        if (username.equals("admin") && password.equals("admin")){
            return 1;
        }
        else if (user == "" || password == "" || !password.equals(pass)){
            return 0;
        }else{
            return 2;
        }
    }
}

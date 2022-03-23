/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectDB {

    private Connection connection = null;
    private final String databaseName = "computer";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/computer";

    public ConnectDB() {

    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return connection;
    }
    public static void main(String[] args) {
        new ConnectDB().getConnection();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import models.ConnectDB;

/**
 *
 * @author HP
 */
public class UserAccountDAO {

    Connection connection = new ConnectDB().getConnection();
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;

    public UserAccountDAO() {
    }

    public void getTableModel(JTable table, String sql) {
        Vector header = new Vector();
        header.add("ID");
        header.add("Fullname");
        header.add("Username");
        header.add("Password");
        header.add("Address");
        header.add("Phone Number");
        header.add("BirthDay");
        header.add("Gender");
        header.add("Position");

        DefaultTableModel model = new DefaultTableModel(header, 0);
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("user_id"));
                vector.add(rs.getString("fullname"));
                vector.add(rs.getString("username"));
                vector.add(rs.getString("password"));
                vector.add(rs.getString("address"));
                vector.add(rs.getString("phone_number"));
                vector.add(rs.getDate("birthday"));
                vector.add(rs.getString("gender"));
                vector.add(rs.getInt("is_admin") == 1 ? "Admin" : "Employee");
                model.addRow(vector);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void delete(String table, String where, String value) {
        try {
            pst = connection.prepareStatement("DELETE FROM " + table + " WHERE " + where + " = " + "'" + value + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete success !!! ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e) ;
        }

    }

}

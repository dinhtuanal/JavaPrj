/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ConnectDB;

/**
 *
 * @author HP
 */
public class ProductDAO {

    Connection connection = new ConnectDB().getConnection();
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;

    public ProductDAO() {

    }

    public void getTableModel(JTable table,String sql) {
        Vector header = new Vector();
        header.add("ID");
        header.add("Name");
        header.add("Imgage Path");
        header.add("Detail");
        header.add("Unit");
        header.add("Price");
        header.add("Remaining");
        header.add("Supplier ID");

        DefaultTableModel model = new DefaultTableModel(header, 0);
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("product_id"));
                vector.add(rs.getString("product_name"));
                vector.add(rs.getString("product_img"));
                vector.add(rs.getString("product_detail"));
                vector.add(rs.getString("unit"));
                vector.add(rs.getInt("price"));
                vector.add(rs.getInt("remaining"));
                vector.add(rs.getString("supplier_id"));
                model.addRow(vector);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    public void add(models.Product p ){
        String sql = "insert into product values (?,?,?,?,?,?,?,?)";
        try{
            pst = connection.prepareStatement(sql);
            pst.setString(1, p.getId());
            pst.setString(2, p.getName());
            pst.setString(3, p.getImagesPath().replace("/", "//"));
            pst.setString(4, p.getDetail());
            pst.setString(5, p.getUnit());
            pst.setInt(6, p.getPrice());
            pst.setInt(7, p.getRemaining());
            pst.setString(8, p.getSupplierId());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add success");
        } catch (SQLException e) {
            Logger.getLogger("Error: " + e);
        }
    }
    public void update(models.Product p){
        String sql = "UPDATE product SET product_name = ?, product_img = ?, product_detail = ?, unit = ?, price = ?, remaining = ?, supplier_id = ? where product_id = ?";
        try{
            pst = connection.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getImagesPath().replace("/", "//"));
            pst.setString(3, p.getDetail());
            pst.setString(4, p.getUnit());
            pst.setInt(5, p.getPrice());
            pst.setInt(6, p.getRemaining());
            pst.setString(7, p.getSupplierId());
            pst.setString(8, p.getId());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    public void deleleById(String id){
        String sql = "DELETE FROM product where product_id = ?";
        try{
            pst = connection.prepareStatement(sql);
            pst.setString(1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success !!! ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " +e);
        }
    }
    public void getElement(){
//        String sql = "SELECT ? from product where "
    /**
    * Cái này mai làm nhé
    */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.UserAccountDAO;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.ConnectDB;
import models.UserAccount;

/**
 *
 * @author HP
 */
public class MyAccount extends javax.swing.JPanel {

    /**
     * Creates new form MyAccount
     */
    public MyAccount() {
        initComponents();
    }

    public MyAccount(UserAccount userLogin) {
        initComponents();
        showForm(userLogin);
    }

    public void showForm(UserAccount userAcount) {
        YourID.setText(userAcount.getUser_id());
        position.setText(userAcount.getIs_admin() == 1 ? "Admin" : "Employee");
        lblUserName.setText(userAcount.getUsername());
        lblName.setText(userAcount.getFullname());
        lblDate.setText(userAcount.getBirthdate().toString());
        lblCall.setText(userAcount.getPhone_number());
        lblWhere.setText(userAcount.getAddress());
        lblGT.setText(userAcount.getGender());
        try {
            Connection connection = new ConnectDB().getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from useraccount where `user_id` = " + "'" + userAcount.getUser_id() + "'");
            while (rs.next()) {
                txtFullname.setText(rs.getString("fullname"));
                txtAddress.setText(rs.getString("address"));
//                txtBirthday.setText(rs.getString("birthday"));
                birthDay.setDate(rs.getDate("birthday"));
                txtPhone.setText(rs.getString("phone_number"));
                if (rs.getString("gender").equals("Male")) {
                    rbMale.setSelected(true);
                } else {
                    rbFemale.setSelected(true);
                }
            }
        } catch (SQLException e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        lblYourID = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        YourID = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblErrorFullname = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorBirth = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        birthDay = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblCall = new javax.swing.JLabel();
        lblWhere = new javax.swing.JLabel();
        lblGT = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1114, 587));
        setMinimumSize(new java.awt.Dimension(1114, 587));
        setPreferredSize(new java.awt.Dimension(1114, 587));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("You can only change personal information such as name, date of birth, phone number, gender, address.");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblYourID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblYourID.setText("Your ID: ");

        lblFullname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblFullname.setText("Fullname: ");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAddress.setText("Address:");

        lblUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsername.setText("Username:");

        lblPhone.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPhone.setText("Phone: ");

        lblBirthday.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblBirthday.setText("Birthday:");

        lblGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblGender.setText("Gender:");

        lblPosition.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPosition.setText("User permissions:");

        txtFullname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFullname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFullnameCaretUpdate(evt);
            }
        });
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAddressCaretUpdate(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPhoneCaretUpdate(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 116, 135));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save your change");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        YourID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        YourID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        YourID.setText("YourID");
        YourID.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnChangePassword.setBackground(new java.awt.Color(255, 116, 135));
        btnChangePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change your password");
        btnChangePassword.setToolTipText("");
        btnChangePassword.setBorder(null);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.setPreferredSize(new java.awt.Dimension(55, 23));

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.setMaximumSize(new java.awt.Dimension(55, 25));
        rbFemale.setMinimumSize(new java.awt.Dimension(55, 25));
        rbFemale.setPreferredSize(new java.awt.Dimension(55, 23));

        lblErrorFullname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblErrorFullname.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorFullname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorFullname.setText("*");

        lblErrorAddress.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorAddress.setText("*");

        lblErrorPhone.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorPhone.setText("*");

        lblErrorBirth.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblErrorBirth.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorBirth.setText("*");

        position.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        position.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        position.setText("Admin/ Employ");
        position.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        position.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Information");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The rest of the information is managed by the administrator and cannot be changed.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Change Your Information Here");

        lblUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserName.setText("Your User");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fullname:");
        jLabel4.setPreferredSize(new java.awt.Dimension(62, 35));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Birthday:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Phone:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Gender:");

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDate.setText("dd/mm/yy");

        lblCall.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCall.setText("number");

        lblWhere.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblWhere.setText("where");

        lblGT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGT.setText("male/female");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Your Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWhere, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCall, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblYourID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(YourID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel3)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullname)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                            .addComponent(txtFullname, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                            .addComponent(lblErrorFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblErrorPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblErrorAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(birthDay, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                            .addComponent(lblErrorBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(lblErrorAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(lblErrorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(birthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(YourID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblYourID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCall, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWhere, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sql = "UPDATE useraccount SET fullname = ?,username = ?,address = ?,phone_number = ?,birthday=?,gender=? WHERE user_id = ?";
        try {
            Connection connection = new ConnectDB().getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, txtFullname.getText().trim());
            pst.setString(2, lblUsername.getText().trim());
            pst.setString(3, txtAddress.getText().trim());
            pst.setString(4, txtPhone.getText().trim());
            pst.setString(5, new SimpleDateFormat("yyyy-MM-dd").format(birthDay.getDate()));
//            pst.setString(5, txtBirthday.getText().trim());
            pst.setString(6, rbMale.isSelected() ? "Male" : "Female");
            pst.setString(7, YourID.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update success");
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "A little error, error code by App Deleloper");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPhoneCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPhoneCaretUpdate
        if (txtPhone.getText().trim().matches("^(\\d|\\+84|\\84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$")) {
            validForm(txtPhone, lblPhone, lblErrorPhone);
        } else {
            invalidForm(txtPhone, lblPhone, lblErrorPhone);
        }
    }//GEN-LAST:event_txtPhoneCaretUpdate

    private void txtFullnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFullnameCaretUpdate
        if (txtFullname.getText().trim().equals("")) {
            invalidForm(txtFullname, lblFullname, lblErrorFullname);
        } else {
            validForm(txtFullname, lblFullname, lblErrorFullname);
        }
    }//GEN-LAST:event_txtFullnameCaretUpdate

    private void txtAddressCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAddressCaretUpdate
        if (txtAddress.getText().trim().equals("")) {
            invalidForm(txtAddress, lblAddress, lblErrorAddress);
        } else {
            validForm(txtAddress, lblAddress, lblErrorAddress);
        }
    }//GEN-LAST:event_txtAddressCaretUpdate

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        String password;
        try {
            Connection conn = new ConnectDB().getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select password from useraccount where user_id = " + "'"+ YourID.getText()+ "'");
            while(rs.next()){
                password = rs.getString("password");
                new ChangePasswordForm(password, YourID.getText()).setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyAccount.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    public void invalidForm(JTextField text, JLabel label1, JLabel label2) {
        Color a = new Color(235, 75, 75);
        text.setBackground(a);
        label2.setText("Invalid " + label1.getText());
        label2.setForeground(new Color(235, 75, 75));
        btnSave.setEnabled(false);
    }

    public void validForm(JTextField text, JLabel label1, JLabel label2) {
        Color a = new Color(99, 237, 81);
        text.setBackground(a);
        label2.setText("");
        label2.setForeground(a);
        btnSave.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel YourID;
    private com.toedter.calendar.JDateChooser birthDay;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCall;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorBirth;
    private javax.swing.JLabel lblErrorFullname;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGT;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWhere;
    private javax.swing.JLabel lblYourID;
    private javax.swing.JLabel position;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class userAccount {

    private String fullname;
    private String username;
    private String pasword;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private String emplCode;

    public userAccount() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "userAccount{" + "fullname=" + fullname + ", username=" + username + ", pasword=" + pasword + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + ", birthDat=" + birthDate + ", emplCode=" + emplCode + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public userAccount(String fullname, String username, String pasword, String email, String address, String phoneNumber, Date birthDate, String emplCode) {
        this.fullname = fullname;
        this.username = username;
        this.pasword = pasword;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.emplCode = emplCode;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

}

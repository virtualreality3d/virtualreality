/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.ArrayList;

/**
 *
 * @author shailu
 */
public class Details {

    public static String Fullname = "";
    public static String Address = "";

    public static int getCC() {
        return CC;
    }

    public static void setCC(int CC) {
        Details.CC = CC;
    }
    public static String email = "";
    public static String mobile = "";
    public static String Gender = "";
    public static String username = "";
    public static String password = "";
    public static int CC;
    public static ArrayList<String> Clicks;

    public static String getFullname() {
        return Fullname;
    }

    public static void setFullname(String Fullname) {
        Details.Fullname = Fullname;
    }

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String Address) {
        Details.Address = Address;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Details.email = email;
    }

    public static String getMobile() {
        return mobile;
    }

    public static void setMobile(String mobile) {
        Details.mobile = mobile;
    }

    public static String getGender() {
        return Gender;
    }

    public static void setGender(String Gender) {
        Details.Gender = Gender;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Details.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Details.password = password;
    }

    public static ArrayList<String> getClicks() {
        return Clicks;
    }

    public static void setClicks(ArrayList<String> Clicks) {
        Details.Clicks = Clicks;
    }
}

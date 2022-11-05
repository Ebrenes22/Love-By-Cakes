/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectcs1;

import Users.User;
import LogRegister.Login;
import Users.AdminApp;
import MySQL.MySQLdb;
import java.util.ArrayList;


/**
 *
 * @author arianasaboriom
 */
public class ProjectCS1 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Login n = new Login();
        //n.setVisible(true);
        ArrayList<String> l = new ArrayList<String>();
        User user = new User();
        //user.register();
        //l = user.registeredData("ale342");
        //for(int i = 0; i < l.size(); i++){
          //  System.out.println(l.get(i));
        //}
        //user.login();
        
        
        MySQLdb db = new MySQLdb();
        AdminApp hello = new AdminApp();
        hello.setVisible(true);
        
    }
}

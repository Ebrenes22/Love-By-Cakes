/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


import View.FanaticView;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author arianasaboriom
 */
public class User {
    //Usuario administrador
    //Corresponsal a cargo
    //Fanaticos
    public User (){}
    
    /*
    Administrador:
    - Crear partidos de jornadas
    - Definir fechas, horas, equipos, alineaciones y corresponsal a cargo
    
    Corresponsal:
    - Visualizar partidos asignados
    - Reportar goles, tarjetas amarillas/rojas y situaciones relevantes del partido
    
    Fanaticos:
    - Chat para cada partido
    - Pueden crear su perfil para definir sus equipos favoritos para mostrar esos de primero
    - Pueden visualizar el minuto a minuto en tiempo real de los acontecimientos que son reportados por los corresponsales
    
    En comun:
    - Deben registrarse
    - Deben loguearse
    - Pueden recuperar contrasena
    - Pueden obtener datos registrados
    */
    
    public void register(){
        LogRegister.Register r = new LogRegister.Register(); 
        r.setVisible(true);
    }
    public void login(){
        LogRegister.Login log = new LogRegister.Login();
        log.setVisible(true);
    }
    public ArrayList<String> registeredData(String username){
        ArrayList<String> list = new ArrayList<String>();
        try{
            Connection cn = MySQL.MySQLdb.getConnection();
            String sql = "select LastName, FirstName, EmailAddress, Username from db1. users where Username = ?"; 
            PreparedStatement ps;
            ps= cn.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(rs.getString(1));
                list.add(rs.getString(2));
                list.add(rs.getString(3));
                list.add(rs.getString(4));
                //System.out.println("LastName: " + rs.getString(1));
                //System.out.println("FirstName: " + rs.getString(2));
                //System.out.println("EmailAddress: " + rs.getString(3));
                //System.out.println("Username: " + rs.getString(4)); 
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return list;
    }
    
    public void userInterface(User typeUser){
        if(typeUser instanceof AdminUser){
            //do something
            //create jframe for the Admin actions
            AdminApp ad = new AdminApp();
            ad.setVisible(true);
        }
        else if(typeUser instanceof Corresponsal){
            //do something
            //create jframe for Corresponsal actions
        }
        else if(typeUser instanceof FanaticUser){
            FanaticView fV =new FanaticView();
            fV.setVisible(true);
        }
        
    }
    
    
}

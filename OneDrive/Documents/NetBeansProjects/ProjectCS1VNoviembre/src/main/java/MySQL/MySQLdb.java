/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;
import java.sql.*;

/**
 *
 * @author arianasaboriom
 */
public class MySQLdb {
    public static Connection getConnection() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "MsLrA22!");
        
        
        return cn;
    }
    
}

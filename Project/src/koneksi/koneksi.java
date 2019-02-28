/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    public static Connection koneksi;
    public static Connection getkoneksi() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/db_jbarang";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            koneksi = DriverManager.getConnection(url,user,pass);
        }catch(SQLException t){
            System.out.println("Error koneksi");
        }return koneksi;
    }
    
    
    
    
}

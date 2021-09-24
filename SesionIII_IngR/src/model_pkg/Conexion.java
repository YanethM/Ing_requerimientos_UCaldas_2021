/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection conection;

    public Conexion() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_ucaldas_db", "root", "");
            if (conection!= null) {
                System.out.println("Conexión éxitosa");
            }
        }catch(SQLException|ClassNotFoundException ex){
            System.out.println(ex);
        } 
    }
    
    public Connection getConnection(){
        return conection;
    }
}
    

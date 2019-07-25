/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basededatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Dante
 */
public class BaseDeDatos implements DBSentencias{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver"); // 1 registro el driver
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/regiones", "root","");   //2 establezco la conección
            Statement s = cn.createStatement(); //Creamos una sentencia
            s.executeUpdate(consulta1);
            
            //Connection c = DriverManager.getConnection("jdbc:mysql://localhost/regiones", "root","root");
        }
        catch(Exception e){
            System.err.println(e);
            
        }
        
    }
    
}

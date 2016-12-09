/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Joe
 */
public class parkingselection 
{
    public Connection con;
    public parkingselection(){
        PriorityQueue parkingspots;
        con=testmysql();
                }
    
   private Connection testmysql(){
       Connection con=null;
            try {  
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://athena.ecs.csus.edu/jhgb?" + 
                                   "user=jhgb_user&password=almoststarted";
             con = DriverManager.getConnection(connectionUrl);
             System.out.println("your vpn is working and database =1");
            
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
            return con;
   }
}

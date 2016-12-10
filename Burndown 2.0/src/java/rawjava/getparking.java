/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawjava;
import java.sql.*;
import rawjava.getsql;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import rawjava.getsql;


/**
 *
 * @author joe
 */
public class getparking {
    public static int takespot(){
        int i=1001;
        int parking_id;
    getsql sparking=new getsql();
        try{
            Statement prep=sparking.con.createStatement();
            ResultSet rs=prep.executeQuery("SELECT FROM ParkingSpots WHERE SP_ID="+1000+" AND Status="+true);
            while (!rs.next()&&i<400){
            rs=prep.executeQuery("SELECT FROM ParkingSpots WHERE SP_ID="+i+" AND Status="+true);
            }
            if(i==400)
                return 0;
            parking_id=rs.getInt("SP_ID");
            prep.executeUpdate("Update ParkingSpots SET Status="+false+"WHERE SP_ID="+parking_id);
            return parking_id;
        }
        catch(Exception e){
    
        }
        return 0;
    }
        public static int returnspot(int parking_id){
        getsql sparking=new getsql();
        try{
            Statement prep=sparking.con.createStatement();
            prep.executeUpdate("Update ParkingSpots SET Status="+true+"WHERE SP_ID="+parking_id);
        }
        catch(Exception e){
            return 0;
        }
        return 1;
    }
}

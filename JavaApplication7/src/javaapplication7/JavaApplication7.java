/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author joe
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=1;
        int l=1;
        getsql sparking=new getsql();
        try{
            Statement statement=sparking.con.createStatement();
            for(int i=1000;i<=1400;i++){
            statement.executeUpdate("INSERT INTO ParkingSpots (SP_ID,leveln,Sp_number,Status) VALUES ("+i+","+l+","+j+","+true+")");
            j++;
            if(j>100){
                j=1;
                l++;
            }
            
            }
                }
        catch(Exception e){    
            System.out.println(e);
        }
    }
}
    


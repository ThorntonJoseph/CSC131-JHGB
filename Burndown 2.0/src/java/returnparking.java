import java.sql.*;
import rawjava.getsql;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import rawjava.getsql;
import java.io.PrintWriter;  
import rawjava.getparking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
@WebServlet("/returnparking")
public class returnparking extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
            int spot_id;
           getsql sparking=new getsql();
           try{  
                    HttpSession name=request.getSession(false);
                    Statement statement=sparking.con.createStatement();
                    ResultSet rs=statement.executeQuery("SELECT SP_ID FROM USERS WHERE UserName='"+name.getAttribute("username")+"';");
                    rs.next(); 
                    spot_id=rs.getInt("SP_ID");
                    getparking.returnspot(spot_id);
                    statement.executeUpdate("UPDATE USERS SET SP_ID="+0+" WHERE UserName='"+name.getAttribute("username")+"';"); 
                    statement.executeUpdate("UPDATE ParkingSpots SET Time_out=now() WHERE SP_ID="+spot_id+";"); 
                    response.sendRedirect("Parking-selection.html");
	}
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
        }
          
}
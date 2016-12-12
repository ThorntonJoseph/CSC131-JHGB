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
import static org.eclipse.jdt.internal.compiler.parser.Parser.name;
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
@WebServlet("/parking")
public class parking extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
            response.setContentType("text/html");
            int spot=getparking.takespot();
           getsql sparking=new getsql();
           try{
                    Statement statement=sparking.con.createStatement();
                    HttpSession name=request.getSession(false);
                    statement.executeUpdate("UPDATE USERS SET SP_ID="+spot+" WHERE UserName='"+name.getAttribute("username")+"'"); 
                    request.setAttribute("id", spot);
                    JOptionPane.showMessageDialog(null, spot);
                    request.getRequestDispatcher("yourparkingnumber.jsp").forward(request, response);
                   
	}
           catch(Exception e){
               JOptionPane.showMessageDialog(null, request.getAttribute("username"));
           }
        }
          
}

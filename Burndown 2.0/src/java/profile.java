
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import rawjava.getsql;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joe
 */
@WebServlet("/profile")
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L; 
        ResultSet rs;
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
            getsql sparking=new getsql(); 
            response.setContentType("text/html");
            try{
                Statement statement=sparking.con.createStatement();
                HttpSession session=request.getSession(false); 
                if(session==null){
                    JOptionPane.showMessageDialog(null, "You must Log in");
                    response.sendRedirect("log-in.html");
                } 
                else{
                
                rs=statement.executeQuery("SELECT SP_ID FROM USERS WHERE UserName='"+session.getAttribute("username")+"'");
                rs.next(); 
                    int id=rs.getInt("SP_ID");
                    if(id==0)  
                        request.getRequestDispatcher("Parking-selection.html").forward(request, response);
                    else{
                        session.setAttribute("id", id);
                        request.getRequestDispatcher("yourparkingnumber.jsp").forward(request, response);
                        }
                }
              }
                catch(Exception e){   
                    JOptionPane.showMessageDialog(null, "no session found");
                }     
        }
    
}

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

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");  
		getsql sparking=new getsql();  
                response.setContentType("text/html"); 
                try{
                    Statement statement=sparking.con.createStatement();
                    ResultSet resultset=statement.executeQuery("SELECT UserName,Fname,Password FROM USERS "
                            + "WHERE UserName='"+username+"';");
       
                    if(resultset.next()){
                       if(password.equals(resultset.getString("Password"))){
                           HttpSession session = request.getSession(true);
                            session.setAttribute("username", username);
                            String ses_id= session.getId();
                            statement.executeUpdate("UPDATE USERS SET Ses_ID='"+ses_id+"' WHERE UserName='"+username+"';"); 
                            request.getRequestDispatcher("profile").forward(request, response);
                        }
                       else{
                           JOptionPane.showMessageDialog(null, "incorrect password ");
                           response.sendRedirect("log-in.html");
                       }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "incorrect username ");
                        response.sendRedirect("log-in.html");
                    }
                    sparking.con.close();
                   
                }
                catch(Exception e){     
                   JOptionPane.showMessageDialog(null, e);
                }
                
            }    
	}


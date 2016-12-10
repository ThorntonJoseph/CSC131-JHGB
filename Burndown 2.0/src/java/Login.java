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
                response.setContentType("text/html");
                PrintWriter out=response.getWriter(); 
                request.getRequestDispatcher("Parking-selection.html").include(request, response);  
		getsql sparking=new getsql();  
                try{
                    Statement statement=sparking.con.createStatement();
                    ResultSet resultset=statement.executeQuery("SELECT UserName,Fname,Password FROM USERS "
                            + "WHERE UserName='"+username+"';");
                    if(resultset.next()){
                        if(password.equals(resultset.getString("Password"))){
                            out.print("Login Success"+resultset.getString("Fname"));
                            HttpSession session = request.getSession();  
                        }
                        else
                           JOptionPane.showMessageDialog(null, "incorrect password ");
                           response.sendRedirect("log-in.html");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "incorrect username ");
                        request.getRequestDispatcher("Parking-selection.html").include(request, response);
                    sparking.con.close();
                    out.close();
                }
                catch(Exception e){     
                }
		}
		
               
               
	}


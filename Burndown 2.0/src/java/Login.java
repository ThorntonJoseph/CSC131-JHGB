import java.sql.*;
import rawjava.parkingselection;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rawjava.parkingselection;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		parkingselection sparking=new parkingselection();  
                try{
                    Statement statement=sparking.con.createStatement();
                    ResultSet resultset=statement.executeQuery("SELECT UserName,Password FROM USERS "
                            + "WHERE UserName='"+username+"';");
                    if(resultset.next()){
                        if(password.equals(resultset.getString("Password")))
                            response.sendRedirect("Parking-selection.html");
                        else
                           response.sendRedirect("log-in.html");
                    }
                    sparking.con.close();
                }
                catch(Exception e){     
                }
		}
		
               
               
	}


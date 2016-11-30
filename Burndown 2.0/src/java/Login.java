import java.sql.*;
import rawjava.parkingselection;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		
		if(username.equals("joe") && password.equals("t")){
                     parkingselection sparking=new parkingselection();
                try{
                Statement statement=sparking.con.createStatement();
                ResultSet resultset=statement.executeQuery("CREATE TABLE PARKING_SPOTS");
                }
                
                catch(Exception e){
                        System.out.println("sqldatabase unreachable");
                }
			response.sendRedirect("Parking-selection.html");
		}
		else
                {
			response.sendRedirect("log-in.html");
		}
               
                
	}
}

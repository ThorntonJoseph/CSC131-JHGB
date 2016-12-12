import java.io.IOException;  
import java.io.PrintWriter;  
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
@WebServlet("/logout")
public class logout extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");   
              getsql sparking=new getsql(); 
            request.getRequestDispatcher("index.html").include(request, response);  
              try{
                Statement statement=sparking.con.createStatement();
                HttpSession session=request.getSession(false); 
                if(session!=null){
                session.invalidate();  
                statement.executeUpdate("UPDATE USERS SET Ses_ID="+null+" WHERE UserName='"+session.getAttribute("username")+"';");
                JOptionPane.showMessageDialog(null, "logout successfull"); 
                }
                else
                 JOptionPane.showMessageDialog(null, "no session found");  
                }
                catch(Exception e){   
                    
                }
		
            
            
                
    }  
}  

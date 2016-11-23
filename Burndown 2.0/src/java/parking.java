
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

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
            PrintWriter out =response.getWriter();
            String mergeFiles="this is your parking number";
            out.println(mergeFiles);
            out.close();
         //Debug Statement
            System.out.println(mergeFiles);
        // *THIS IS THE WAY I AM SEND DATA TO JSP PAGE.*
            request.setAttribute("todo", mergeFiles);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}

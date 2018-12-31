package com.inigoserrano.openshift.aplicacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/aplicacion" })
public class Aplicacion extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8532332299687592651L;

	@Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Saida GET");
        response.getWriter().println("Saida GET app v1");  
        response.getWriter().flush();
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Saida POST");
        response.getWriter().println("Saida POST");
        response.getWriter().flush();

    }

}

package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emailid = request.getParameter("emailid");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
//		if(name.equals("Siddu") && pass.equals("123")) {
//			pw.println("Successful");
//		}else {
//			pw.println("Failure try once again");
//		}
//		
//		pw.println("Welcome Client to Web Application " +name);
//	}
		RequestDispatcher rd1=request.getRequestDispatcher("dashboard.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("logOut.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","Siddu@04");
			PreparedStatement pstmt=con.prepareStatement("select * from login where emailid=? and password=?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				pw.println("Successfully login");
				rd1.forward(request, response);
			}else {
				pw.println("Invalid email id or password");
				rd2.include(request, response);
			}
		}catch(Exception e) {
			pw.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PrintWriter pw=response.getWriter();
				
				response.setContentType("text/html");
				RequestDispatcher rd2=request.getRequestDispatcher("logOut.html");

				String emailid = request.getParameter("emailid");
				String password=request.getParameter("password");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","Siddu@04");
					PreparedStatement pstmt=con.prepareStatement("insert into login values (?,?) ");
					pstmt.setString(1, emailid);
					pstmt.setString(2, password);
					int rs=pstmt.executeUpdate();
					if(rs>0) {
						pw.println("Account created successfully");
					}
				}catch(Exception e) {
					pw.println("Acount Already Existed");
					rd2.include(request, response);
				}
			}

	}
package com.wipro.webappp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= resp.getWriter();
		String trigerFrom = req.getParameter("bookButton");
		if (trigerFrom.equals("check")) {
		String doll= req.getParameter("num");
		int res=Integer.parseInt(doll)*70; 
		out.println("<h1>"+doll+" United States Dollar"+" "+ res +" "+"Indian Rupee"+"</h1>");
		out.close();
		//req.setAttribute("result", res);
		//req.getRequestDispatcher("new.jsp").forward(req, resp);
			}
	}

}

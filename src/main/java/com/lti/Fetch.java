package com.lti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;
@WebServlet("/fet")
public class Fetch extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao dao = new CustomerDao();
		int id=Integer.parseInt(request.getParameter("id"));
		Customer c= dao.display(id);
		PrintWriter out = response.getWriter();
		out.println("City : " +c.getCity()+"<br>");
		out.println("Email : " +c.getEmail()+"<br>");
		out.println("Name : " +c.getName()+"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

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


public class UpdateCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c = new Customer();
		c.setId(Integer.parseInt(request.getParameter("id")));
		c.setCity(request.getParameter("city"));
		c.setName(request.getParameter("name"));
		c.setEmail(request.getParameter("email"));
		CustomerDao dao =new CustomerDao();		
		dao.update(c);
		
		response.sendRedirect("Fetch?id="+c.getId());
	
	}
}

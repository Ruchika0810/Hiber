package com.lti;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;


@WebServlet("/Customer")
public class Cust extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c= new Customer();
		c.setName(request.getParameter("name"));
		c.setCity(request.getParameter("city"));
		c.setEmail(request.getParameter("email"));
		
		CustomerDao dao= new CustomerDao();
		dao.add(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

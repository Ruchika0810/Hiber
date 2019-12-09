package com.lti;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

public class Fetch2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao dao = new CustomerDao();
		int id=Integer.parseInt(request.getParameter("id"));
		Customer c= dao.display(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("customer", c);
		
		response.sendRedirect("viewCustomerDetails.jsp");
	}
}

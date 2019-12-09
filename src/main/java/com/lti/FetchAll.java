package com.lti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;
public class FetchAll extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao dao = new CustomerDao();
		List<Customer> list = dao.fetchAll();
		for(Customer c : list) {
			PrintWriter out = response.getWriter();	
			out.println("<strong>The details of Customer :"+ c.getId()+ "  </strong><br>");
			out.println("CITY: "+ c.getCity()+ "&nbsp&nbsp <br>");
			out.println("NAME: "+c.getName()+"&nbsp&nbsp <br>");
			out.println("EMAIL: "+c.getEmail()+ "<br><br>");
			}
	}
}

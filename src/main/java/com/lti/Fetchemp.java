package com.lti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.EmployeeDao;
import com.lti.entity.Employee;

public class Fetchemp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));
	EmployeeDao dao = new EmployeeDao();
	Employee emp = dao.fetch(id);
	PrintWriter out=response.getWriter();
	out.println(emp.getEmpno());
	out.println(emp.getName());
	out.println(emp.getSalary());
	out.println(emp.getDateofjoining());
	}

}

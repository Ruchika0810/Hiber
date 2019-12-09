package com.lti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.CustomerDao;
import com.lti.dao.EmployeeDao;
import com.lti.entity.Customer;
import com.lti.entity.Employee;


public class FetchAllEmp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list=dao.fetchAll();
		for(Employee e : list) {
			PrintWriter out = response.getWriter();	
			out.println("<strong>The details of Employee :"+ e.getEmpno()+ "  </strong><br>");
			out.println("Name: "+ e.getName()+ "&nbsp&nbsp <br>");
			out.println("Salary: "+e.getSalary()+"&nbsp&nbsp <br>");
			out.println("DOJ: "+e.getDateofjoining()+ "<br><br>");
			}

	}

}

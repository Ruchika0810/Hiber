package com.lti;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.EmployeeDao;
import com.lti.entity.Employee;


public class addEmp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = new Employee();
		emp.setName(request.getParameter("name"));
		emp.setSalary(Double.parseDouble(request.getParameter("salary")));
		emp.setDateofjoining(LocalDate.parse(request.getParameter("dateofjoining")));
		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);
		}

}

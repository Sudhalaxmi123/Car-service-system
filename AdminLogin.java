package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Admin;
import com.qn.model.Customer;


public class AdminLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminUsername = request.getParameter("username");
		String adminPassword = request.getParameter("password");
		
		Admin a=new Admin();
		a.setAdminUsername(adminUsername);
		a.setAdminPassword(adminPassword);
		int status = a.adminLogin();
	    if(status==1) {
	    	
	    	response.sendRedirect("/Car-service-system/AdminLoginSuccess.jsp");
	    }
	    else if(status==-1){
	    	response.sendRedirect("/Car-service-system/invalidAdminUsername.jsp");
	    }
	    else {
	    	response.sendRedirect("/Car-service-system/invalidAdminPassword.jsp");
	    }
	}

}

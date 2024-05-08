package org.example.bai2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ("123456".equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);

			response.sendRedirect("dashboard.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
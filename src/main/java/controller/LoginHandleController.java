package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.UserDao;
import model.vo.User;

@WebServlet("/login-handle")
public class LoginHandleController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			UserDao userDao = new UserDao();
			User user = userDao.findById(id); 
			if(user == null || ! user.getPassword().equals(password)) {
				request.getRequestDispatcher("/WEB-INF/view/login-error.jsp").forward(request, response);
			} else {
				request.getSession().setAttribute("authUser", user);
				request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/WEB-INF/view/login-error.jsp").forward(request, response);
		}
		}
	}


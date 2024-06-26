package controller.posts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.PostDao;
import model.vo.Post;
import model.vo.User;

@WebServlet("/posts/view")
public class PostViewController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			User authUser = (User) req.getSession().getAttribute("authUser");
		int no = Integer.parseInt(req.getParameter("no"));
          PostDao postDao = new PostDao();
          Post post = postDao.findByNo(no);
          req.setAttribute("post",post);
		
          req.getRequestDispatcher("/WEB-INF/view/posts/view.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

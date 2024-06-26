package controller.posts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.PostDao;
import model.vo.Post;

@WebServlet("/posts/view/*")
public class PostViewController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
          String uri = req.getRequestURI();
          int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));
          PostDao postDao = new PostDao();
          Post post = postDao.findByNo(id);
          req.setAttribute("post",post);
		
          req.getRequestDispatcher("/WEB-INF/view/posts/view.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
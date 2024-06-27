package controller.posts;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.PostDao;
import model.vo.Post;

@WebServlet("/list/category")
public class PostsCategoryController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String categroy = req.getParameter("category");
			PostDao postDao = new PostDao();
			List<Post> posts = postDao.findByCategroyPosts(categroy);
			req.setAttribute("posts", posts);
			req.setAttribute("category", categroy);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/WEB-INF/view/posts/category-list.jsp").forward(req, resp);

	}

}

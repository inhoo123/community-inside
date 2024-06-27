package controller.posts;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.CommentDao;
import model.dao.PostDao;
import model.dao.UserDao;
import model.vo.Comment;
import model.vo.Post;
import model.vo.User;

@WebServlet("/posts/view")
public class PostViewController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			PostDao postDao = new PostDao();
			UserDao userDao = new UserDao();

			int no = Integer.parseInt(req.getParameter("no"));
			
			Post post = postDao.findByNo(no);
			
			User writer = userDao.findById(post.getWriterId());
			req.setAttribute("post", post);
			req.setAttribute("writer", writer);
			
			CommentDao commentDao = new CommentDao();
			List<Comment> comments   =  commentDao.findAllByPostNo(no);
			req.setAttribute("comments", comments);
			
			req.getRequestDispatcher("/WEB-INF/view/posts/view.jsp").forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package controller.posts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.CommentDao;
import model.dao.LikeDao;
import model.dao.PostDao;
import model.vo.Comment;
import model.vo.Like;

import model.vo.Post;
import model.vo.User;

@WebServlet("/posts/view")
public class PostViewController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			// no
			int no = Integer.parseInt(req.getParameter("no"));
			PostDao postDao = new PostDao();
			Post post = postDao.findByNo(no);

//오늘할거
//			LikeDao likeDao = new LikeDao();
//			List<Like> likes = likeDao.increaseLikeCountByNo(no);
//			if(!likes.contains(no)) {
//				return;
//			}
//			User authUser = (User) req.getSession().getAttribute("authUser");
//			List<String> userIds = new ArrayList<>();

			// 조회수
			boolean f = postDao.increaseViewCountByNo(no);

			req.setAttribute("post", post);

			// 댓글
			CommentDao commentDao = new CommentDao();
			List<Comment> comments = commentDao.findAllByPostNo(no);
			req.setAttribute("comments", comments);

			req.getRequestDispatcher("/WEB-INF/view/posts/view.jsp").forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

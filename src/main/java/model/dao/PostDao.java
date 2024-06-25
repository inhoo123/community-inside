package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.Post;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class PostDao {
//=========================저장===========================================================================================
	public boolean save(Post newPost) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("community_inside");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO POSTS VALUES(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, newPost.getNo());
			stmt.setString(2, newPost.getCategory());
			stmt.setString(3, newPost.getTitle());
			stmt.setString(4, newPost.getBody());
			stmt.setString(5, newPost.getWriterId());
			stmt.setDate(6, newPost.getWritedAt());
			stmt.setInt(7, newPost.getViewCount());
			stmt.setInt(8, newPost.getLikes());
			stmt.setInt(9, newPost.getDislikes());

			int r = stmt.executeUpdate();
			return r == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
//========================삭제================================================================================================
	
	public boolean deleteByNo(int no) throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("community_inside");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("DELETE FROM POSTS WHERE NO=?");
			stmt.setInt(1, no);

			int r = stmt.executeUpdate();

			return r == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
//=====================카테고리============================================	
	public List<Post> findByCategroyPosts(String category) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("community_inside");
		ods.setPassword("oracle");
		try (Connection conn = ods.getConnection()) {
			// 식별키로 조회하고,
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM POSTS WHERE CATEGORY=? ORDER BY CATEGORY");

			stmt.setString(1, category);

			ResultSet rs = stmt.executeQuery();
			List<Post> posts = new ArrayList<>();
			while (rs.next()) {
				// rs.getString("writer_id");
				Post one = new Post(rs.getInt("no"), rs.getString("category"), rs.getString("title"),
						rs.getString("body"), rs.getString("writer_id"), rs.getDate("writed_at"),rs.getInt("view_count"),rs.getInt("likes"),rs.getInt("dislikes"));
				posts.add(one);
			}

			return posts;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
//==============================================	
}

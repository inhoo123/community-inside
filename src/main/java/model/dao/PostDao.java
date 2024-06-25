package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.Post;
import model.vo.User;
import oracle.jdbc.datasource.impl.OracleDataSource;
//=========================저장=================================
public class PostDao {
	public boolean save(Post newPost) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("community_inside");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?,?,?,?)");
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
//========================수정===================================================
	
	public boolean deleteByNo(int no) throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
		ods.setUser("rentalbook");
		ods.setPassword("oracle");

		try (Connection conn = ods.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("DELETE FROM FEEDS WHERE NO=?");
			stmt.setInt(1, no);

			int r = stmt.executeUpdate();

			return r == 1 ? true : false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}
//======================================================================	
}

package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.vo.Comment;
import oracle.jdbc.datasource.impl.OracleDataSource;

public class CommentDao {
	//=========================저장===========================================================================================
		public boolean save(Comment newComment) throws Exception {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
			ods.setUser("community_inside");
			ods.setPassword("oracle");

			try (Connection conn = ods.getConnection()) {

				PreparedStatement stmt = conn.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?,?,?,?)");
				stmt.setInt(1, newComment.getNo());
				stmt.setString(2, newComment.getBody());
				stmt.setDate(3, newComment.getWritedAt());
				stmt.setInt(4, newComment.getLikes());
				stmt.setInt(5, newComment.getDislikes());
				stmt.setString(6, newComment.getWriterId());
				stmt.setString(7, newComment.getPassword());
			

				int r = stmt.executeUpdate();
				return r == 1 ? true : false;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

		}
	//========================삭제================================================================================================
		
		public boolean deleteByNo(String password) throws SQLException {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@//3.36.66.249:1521/xe");
			ods.setUser("community_inside");
			ods.setPassword("oracle");

			try (Connection conn = ods.getConnection()) {

				PreparedStatement stmt = conn.prepareStatement("DELETE FROM COMMENTS WHERE PASSWORD=?");
				stmt.setString(1, password);

				int r = stmt.executeUpdate();

				return r == 1 ? true : false;
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}

		}
	//======================================================================	
}

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAO_LoginLogic {

	public Member execute(String id, String password){
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "");
			pstmt = con.prepareStatement("SELECT * FROM member WHERE memberid = ? AND password = ?");
			pstmt.setString(1,id);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Member user = new User(rs.getString("memberid"), rs.getString("name"), rs.getString("password"));
				return user;
			}
			rs.close();
			return null;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (con != null) {
				try{
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
	}

}

package com.example.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	public void insertMember() {
		String sql = """
				INSERT INTO TBL_MEMBER(MEMBER_ID,LOGIN_ID,PASSWORD,GENDER)
				VALUES(SEQ_MEMBER.NEXTVAL,?,?,?)
				""";
		try(
				Connection conn = DBconnecter.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				
				
				){
			ps.setString(1, loginID);
			ps.setString(2, password);
			ps.setString(3, gender);
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

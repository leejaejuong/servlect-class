package com.example.app.ex02;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.app.dao.DBconnecter;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jdbc-result")
public class jdbcResultServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String loginID =req.getParameter("loginId");
String password =req.getParameter("password");
String gender =req.getParameter("gender");

System.out.println("loginID : " +loginID);
System.out.println("password : " +password);
System.out.println("gender : " +gender);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String loginID =req.getParameter("loginId");
	String password =req.getParameter("password");
	String gender =req.getParameter("gender");
	
	System.out.println("loginID : " +loginID);
	System.out.println("password : " +password);
	System.out.println("gender : " +gender);
	
	MemberDTO memberDTO = new MemberDTO();
	memberDTO.setLoginId(loginID);
	memberDTO.setPassword(password);
	memberDTO.setGenter(gender);
	
	MemberDAO memberDAO = new MemberDAO();
	memberDAO.insertMember(memberDTO);
//	============================================
//	JDBC
//	String sql = """
//			INSERT INTO TBL_MEMBER(MEMBER_ID,LOGIN_ID,PASSWORD,GENDER)
//			VALUES(SEQ_MEMBER.NEXTVAL,?,?,?)
//			""";
//	try(
//			Connection conn = DBconnecter.getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			
//			
//			){
//		ps.setString(1, loginID);
//		ps.setString(2, password);
//		ps.setString(3, gender);
//		ps.executeUpdate();
//	} catch(Exception e) {
//		e.printStackTrace();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
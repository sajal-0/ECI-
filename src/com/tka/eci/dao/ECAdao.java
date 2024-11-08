package com.tka.eci.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.eci.entity.Candidate;

public class ECAdao {
	
	List<Candidate> allCandidate = null;
	
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/advjava193";
	String uname = "root";
	String pwd = "Pass@123";
	String sql = "SELECT * FROM advjava193.candidate";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	public List<Candidate> allCandidate(){
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url, uname, pwd);
		
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			allCandidate = new ArrayList<>();
			
			while(rs.next()) {
				int cid = rs.getInt("cid");
				String name = rs.getString("name");
				String party = rs.getString("party");
				String state = rs.getString("state");
				String assembly = rs.getString("assembly");
				int assem_no = rs.getInt("assembly_no");
				String status = rs.getString("status");
				String gen = rs.getString("gender");
				int age = rs.getInt("age");
				
				
				Candidate obj = new Candidate(cid,name,party,state,assembly,assem_no,status,gen,age);
				allCandidate.add(obj);
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		return allCandidate;
	}
}

package com.chance.ssm.utils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chance.ssm.po.vo.NurseRankingVO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBC {
	
	public static Connection getConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://192.168.0.119:3306/nursedoor?characterEncoding=utf8";
	    String username = "root";
	    String password = "chance";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
//	public static void main(String[] args) {
//		Connection con = getConn();
//		System.out.println(con);
//	}
	public ResultSet selectNurseRanking(Integer key,String nurseId){
		NurseRankingVO nurseRankingVO = new NurseRankingVO();
		Connection conn = getConn();
		ResultSet rs = null;
		String sql = "SELECT * FROM (SELECT nurse_id,nurse_header,nurse_mark,'"+key+"':='"+key+"'+1 AS rank FROM nurse ORDER BY nurse_mark DESC) nurse WHERE nurse_id = '"+nurseId+"';";
		PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) conn.prepareStatement(sql);
		        rs= pstmt.executeQuery();
		        System.out.println("resutl: " + rs);
		        pstmt.close();
		        conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		return rs;
	};
}

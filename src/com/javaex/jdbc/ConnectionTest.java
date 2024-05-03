package com.javaex.jdbc;

import java.sql.*;

public class ConnectionTest {
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			/*
			 * JAVA 6(JDBC 4.0) 이상이면 getConnection메소드가 적절한 드라이버를 찾아 
			 * 로드하기 때문에 드라이버 로드는 생략해도 된다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connection
			con = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println("good. 연결 시작");
			System.out.println(con);
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees");
			while (rs.next())
				System.out.println(rs.getInt("employee_id"));

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.err.println("SQL 에러");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
				System.out.println("연결 종료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";

		ResultSet rs = null;
		try (
			Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
			Statement stmt = con.createStatement();
		) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String sql = "SELECT department_id, department_name FROM departments";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int deptId = rs.getInt(1);
				String deptName = rs.getString("department_name");
				System.out.printf("%d : %s%n", deptId, deptName);
			}

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.err.println("SQL 에러");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				System.out.println("연결 종료");
			} catch (SQLException e) {
				System.err.println("ResultSet을 닫는 데 실패했습니다.");
			}
		}
	}
}

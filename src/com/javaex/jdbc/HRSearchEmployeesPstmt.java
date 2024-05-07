package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {
    public static void main(String[] args) {
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:dbms이름:드라이버종류:ip:port:db이름
        String dbid = "hr"; // id
        String dbpass = "hr"; // password

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = """
                SELECT first_name, 
                    last_name, 
                    email, '+' || replace(phone_number, '.', '-'), 
                    TO_CHAR(hire_date, 'yyyy-mm-dd')
                FROM employees
                WHERE LOWER(first_name) LIKE LOWER(?) 
                    OR LOWER(last_name) LIKE LOWER(?)
                """;
        ; // SQL 입력

        try (Scanner sc = new Scanner(System.in)) {
            // Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 4.0(JDK 6) 아래 버전은
            // 필요
            con = DriverManager.getConnection(dburl, dbid, dbpass);
            pstmt = con.prepareStatement(sql);
            System.out.print("사원 이름을 입력하세요.\n> ");
            String str = "%" + sc.nextLine().trim() + "%";
            try {
                pstmt.setString(1, str);
                pstmt.setString(2, str);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s%n",
                            "이름", "성", "이메일", "전화번호", "입사일");
                    while (rs.next())
                        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n",
                                rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                }
            } catch (SQLTimeoutException e) {
                System.err.println("타임아웃. SQL 에러");
            } catch (SQLException e) {
                System.err.println("SQL 에러");
            }
        } catch (SQLTimeoutException e) {
            System.err.println("타임아웃. DB 접근 실패");
        } catch (SQLException e) {
            System.err.println("DB 접근 에러");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection 객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("Statement 객체를 닫는 데 실패했습니다.");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("ResultSet 객체를 닫는 데 실패했습니다.");
                }
            }
        }
    }
}

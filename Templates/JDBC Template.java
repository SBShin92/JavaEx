package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

public class JDBCTemplate {
    public static void main(String[] args) {
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:dbms이름:드라이버종류:ip:port:db이름
        String dbid = "hr"; // id
        String dbpass = "hr"; // password

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = """

                """;
        ; // SQL 입력

        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 4.0(JDK 6) 아래 버전은
            // 필요
            con = DriverManager.getConnection(dburl, dbid, dbpass);
            stmt = con.createStatement();
            try {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    // Do
                }
                // EX)
                // System.out.printf("%-20s %-20s %-20s %-20s%n",
                //         "이름", "성", "매니저 이름", "매니저 성");
                // while (rs.next())
                //     System.out.printf("%-20s %-20s %-20s %-20s%n",
                //             rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
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
            if (stmt != null) {
                try {
                    stmt.close();
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

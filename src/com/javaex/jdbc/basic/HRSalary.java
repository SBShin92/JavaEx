package com.javaex.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {
    public static void main(String[] args) {
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:dbms이름:드라이버종류:ip:port:db이름
        String dbid = "hr"; // id
        String dbpass = "hr"; // password

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = """
                    SELECT first_name || ' ' || last_name,
                        salary
                    FROM employees
                    WHERE salary >= minsal AND salary <= maxsal
                """;
        ; // SQL 입력

        try (Scanner sc = new Scanner(System.in)) {
            // Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 4.0(JDK 6) 아래 버전은
            // 필요
            con = DriverManager.getConnection(dburl, dbid, dbpass);
            stmt = con.createStatement();
            System.out.println("최소급여와 최대급여를 입력하세요.");
            System.out.print("최소급여: ");
            String inputLine = sc.nextLine().trim();
            String minSalary = "0";
            if (inputLine != "")
                minSalary = inputLine;
            System.out.print("최대급여: ");
            inputLine = sc.nextLine().trim();
            String maxSalary = "999999999";
            if (inputLine != "")
                maxSalary = inputLine;
            sql = sql.replace("minsal", minSalary);
            sql = sql.replace("maxsal", maxSalary);
            try {
                rs = stmt.executeQuery(sql);
                System.out.println("===================================");
                while (rs.next()) {
                        System.out.printf("%-30s %-10s%n",
                                rs.getString(1), rs.getString(2));
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

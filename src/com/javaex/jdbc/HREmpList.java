package com.javaex.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HREmpList {
    public static void main(String[] args) {
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbuser = "hr";
        String dbpass = "hr";
        String sql = """
                SELECT
                emp.first_name,
                emp.last_name,
                mng.first_name,
                mng.last_name
                FROM employees emp JOIN employees mng ON emp.manager_id = mng.employee_id
                ORDER BY emp.first_name DESC""";

        ResultSet rs = null;
        try (
                Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
                Statement stmt = con.createStatement();) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            rs = stmt.executeQuery(sql);

            System.out.printf("%-20s %-20s %-20s %-20s%n",
                    "이름", "성", "매니저 이름", "매니저 성");
            while (rs.next())
                System.out.printf("%-20s %-20s %-20s %-20s%n",
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                System.err.println("ResultSet 객체를 닫는 데 실패했습니다.");
            }
        }

    }
}

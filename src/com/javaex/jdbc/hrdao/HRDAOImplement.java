package com.javaex.jdbc.hrdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HRDAOImplement implements HRDAO {

    private Connection getConnection() throws SQLException {
        Connection con = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,
                    DatabaseConfig.DB_USER,
                    DatabaseConfig.DB_PASS);
        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        }
        return con;
    }

    @Override
    public List<HRVO> getListFromSearchName(String inputLine) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<HRVO> hrvoLst = new ArrayList<>();
        HRVO hrvo = null;

        String sql = """
                SELECT first_name,
                last_name,
                email,
                '+' || replace(phone_number, '.', '-') "phoneNumber",
                hire_date,
                salary
                FROM employees
                WHERE LOWER(first_name) LIKE LOWER(?)
                    OR LOWER(last_name) LIKE LOWER(?)
                    """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + inputLine + "%");
            pstmt.setString(2, "%" + inputLine + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                hrvo = new HRVO(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getLong(6));
                hrvoLst.add(hrvo);
            }
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("close failed: Connection Object");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("close failed: PreparedStatement Object");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("close failed: ResultSet Object");
                }
            }
        }
        return hrvoLst;
    }

    @Override
    public List<HRVO> getListFromMinMaxSalary(Long minSalary, Long maxSalary) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<HRVO> hrvoLst = new ArrayList<>();
        HRVO hrvo = null;

        String sql = """
                SELECT first_name,
                last_name,
                email,
                '+' || replace(phone_number, '.', '-') "phoneNumber",
                hire_date,
                salary
                FROM employees
                WHERE salary >= ? AND salary <= ?
                    """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, minSalary);
            pstmt.setLong(2, maxSalary);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                hrvo = new HRVO(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getLong(6));
                hrvoLst.add(hrvo);
            }
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("close failed: Connection Object");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("close failed: PreparedStatement Object");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("close failed: ResultSet Object");
                }
            }
        }
        return hrvoLst;
    }
}

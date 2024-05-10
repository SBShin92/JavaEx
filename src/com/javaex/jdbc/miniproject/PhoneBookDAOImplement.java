package com.javaex.jdbc.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookDAOImplement implements PhoneBookDAO {

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DatabaseConfig.DRIVER);
        Connection con = DriverManager.getConnection(DatabaseConfig.URL,
                DatabaseConfig.ID,
                DatabaseConfig.PASSWORD);
        return con;
    }

    @Override
    public boolean checkIsPhoneBookTable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean createPhoneBookTable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean dropPhoneBookTable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<PhoneBookVO> getList() {
        List<PhoneBookVO> lst = new ArrayList<>();
        String sql = """
                    SELECT id, name, hp, tel
                    FROM phone_book
                """;
        try (
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                PhoneBookVO tmp = new PhoneBookVO(rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("hp"),
                        rs.getString("tel"));
                lst.add(tmp);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        }
        return lst;
    }

    @Override
    public boolean insert(String name, String hp, String tel) {
        int result = 0;
        String sql = """
                    INSERT INTO phone_book (id, name, hp, tel)
                    VALUES (seq_phone_book.NEXTVAL, ?, ?, ?)
                """;
        try (
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, name);
            pstmt.setString(2, hp);
            pstmt.setString(3, tel);
            result = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        }
        return result == 1;
    }

    @Override
    public boolean delete(Long id) {
        int result = 0;
        String sql = """
                    DELETE FROM phone_book
                    WHERE id = ?
                """;
        try (
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setLong(1, id);
            result = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        }
        return result == 1;
    }

    @Override
    public List<PhoneBookVO> search(String searchInputString) {
        ResultSet rs = null;
        List<PhoneBookVO> lst = new ArrayList<>();
        String sql = """
                    SELECT id, name, hp, tel
                    FROM phone_book
                    WHERE name LIKE ?
                """;

        try (
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, "%" + searchInputString + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                PhoneBookVO tmp = new PhoneBookVO(rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("hp"),
                        rs.getString("tel"));
                lst.add(tmp);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.err.println("SQL 에러");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("ResultSet 객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return lst;
    }
}

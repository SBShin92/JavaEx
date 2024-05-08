package com.javaex.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImplOracle implements AuthorDAO {
    private Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
            con = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver를 찾을 수 없습니다.");
        }
        return con;
    }

    @Override
    public List<AuthorVO> getList() {
        List<AuthorVO> lst = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = """
                SELECT author_id,
                    author_name,
                    author_desc
                FROM author
                """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Long authorId = rs.getLong(1);
                String authorName = rs.getString(2);
                String authorDesc = rs.getString(3);
                AuthorVO tmp = new AuthorVO(authorId, authorName, authorDesc);
                lst.add(tmp);
            }
        } catch (SQLException e) {
            System.err.println("연결 실패");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("PreparedStatement객체를 닫는 데 실패했습니다.");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("ResultSet객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return lst;
    }

    @Override
    public boolean delete(Long id) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int deleteCount = 0;
        String sql = """
                DELETE FROM author
                WHERE author_id = ?
                """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            deleteCount = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("연결 실패");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("PreparedStatement객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return deleteCount == 1;
    }

    @Override
    public AuthorVO get(Long id) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        AuthorVO vo = null;
        String sql = """
                SELECT author_id,
                    author_name,
                    author_desc
                FROM author
                WHERE author_id = ?
                """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if (rs.next() && rs.getLong("author_id") == id) {
                vo = new AuthorVO(rs.getLong("author_id"),
                        rs.getString("author_name"),
                        rs.getString("author_desc"));
            }
        } catch (SQLException e) {
            System.err.println("연결 실패");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("PreparedStatement객체를 닫는 데 실패했습니다.");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("ResultSet객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return vo;
    }

    @Override
    public boolean insert(AuthorVO authorVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int insertedCount = 0;

        String sql = """
                INSERT INTO author(
                    author_id,
                    author_name,
                    author_desc
                ) VALUES (
                    SEQ_AUTHOR_ID.NEXTVAL,
                    ?,
                    ?
                )
                """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, authorVO.getAuthorName());
            pstmt.setString(2, authorVO.getAuthorDesc());
            insertedCount = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("연결 실패");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("PreparedStatement객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return insertedCount == 1;
    }

    @Override
    public boolean update(AuthorVO authorVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int updatedCount = 0;

        String sql = """
                UPDATE author
                SET author_name = ?,
                    author_desc = ?
                WHERE author_id = ?
                """;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(3, authorVO.getAuthorId());
            pstmt.setString(1, authorVO.getAuthorName());
            pstmt.setString(2, authorVO.getAuthorDesc());
            updatedCount = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("연결 실패");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Connection객체를 닫는 데 실패했습니다.");
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.err.println("PreparedStatement객체를 닫는 데 실패했습니다.");
                }
            }
        }
        return updatedCount == 1;
    }

}
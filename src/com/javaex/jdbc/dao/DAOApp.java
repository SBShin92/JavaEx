package com.javaex.jdbc.dao;

import java.util.List;
import java.util.Scanner;

public class DAOApp {
    static final String CHAR_UTF8 = "UTF-8";
    static final String CHAR_CP949 = "CP949"; // 윈도우 터미널용
    static final String CHARSET = CHAR_CP949;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, CHARSET);
        boolean flag = true;
        listAuthors();
        while (flag) {
            System.out.println("Enter.전체조회 1.GET 2.INSERT 3.UPDATE 4.DELETE 5.종료");
            String select = sc.nextLine().trim();
            switch (select) {
                case "":
                    listAuthors();
                    break;
                case "1":
                    getAuthor(sc);
                    break;
                case "2":
                    insertAuthor(sc);
                    break;
                case "3":
                    updateAuthor(sc);
                    break;
                case "4":
                    deleteAuthor(sc);
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("정확한 값을 넣어주세요");
                    break;
                }
            System.out.println("=============================");

        }
        System.out.println("[종료]");
        sc.close();
    }

    private static void deleteAuthor(Scanner sc) {
        System.out.print("삭제할 레코드 ID?: ");
        Long id = Long.parseLong(sc.nextLine().trim());

        AuthorDAO dao = new AuthorDAOImplOracle();
        boolean flag = dao.delete(id);
        System.out.println("DELETE " + (flag ? "SUCCESS!!" : "failed.."));
    }

    private static void getAuthor(Scanner sc) {
        System.out.print("조회할 레코드 ID?: ");
        Long id = Long.parseLong(sc.nextLine().trim());

        AuthorDAO dao = new AuthorDAOImplOracle();
        AuthorVO vo = dao.get(id);
        if (vo != null)
            System.out.println(vo);
    }

    private static void updateAuthor(Scanner sc) {
        System.out.print("변경할 레코드 ID?: ");
        Long id = Long.parseLong(sc.nextLine().trim());
        System.out.print("이름: ");
        String name = sc.nextLine().trim();
        System.out.print("정보: ");
        String desc = sc.nextLine().trim();

        AuthorVO vo = new AuthorVO(id, name, desc);
        AuthorDAO dao = new AuthorDAOImplOracle();
        boolean flag = dao.update(vo);

        System.out.println("UPDATE " + (flag ? "SUCCESS!!" : "failed.."));
    }

    private static void insertAuthor(Scanner sc) {
        System.out.print("이름: ");
        String name = sc.nextLine().trim();
        System.out.print("정보: ");
        String desc = sc.nextLine().trim();

        AuthorVO vo = new AuthorVO(name, desc);
        AuthorDAO dao = new AuthorDAOImplOracle();
        boolean flag = dao.insert(vo);

        System.out.println("INSERT " + (flag ? "SUCCESS!!" : "failed.."));
    }

    private static void listAuthors() {
        AuthorDAO dao = new AuthorDAOImplOracle();
        List<AuthorVO> daoLst = dao.getList();
        System.out.println("========= 작가 목록 ==========");
        if (daoLst.size() == 0)
            System.out.println("데이터가 엄서요...");
        for (AuthorVO node : daoLst) {
            System.out.println(node);
        }
        System.out.println("=============================");

    }
}

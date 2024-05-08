package com.javaex.jdbc.hrdao;

import java.util.List;
import java.util.Scanner;

public class HRApp {
    static final String CHAR_UTF8 = "UTF-8";
    static final String CHAR_CP949 = "CP949";
    static String CHARSET = CHAR_CP949;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, CHARSET);
        System.out.print("사원 이름을 입력하세요\n > ");
        String inputLine = sc.nextLine().trim();

        run(inputLine);
        sc.close();
    }

    private static void run(String inputLine) {
        HRDAO dao = new HRDAOImplement();
        List<HRVO> lst = dao.getListFromSearch(inputLine);
        for (HRVO node: lst) {
            System.out.println(node);
        }
    }
}

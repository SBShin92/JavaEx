package com.javaex.jdbc.hrdao;

import java.util.List;
import java.util.Scanner;

public class HRApp {
    static final String CHAR_UTF8 = "UTF-8";
    static final String CHAR_CP949 = "CP949";
    static String CHARSET = CHAR_CP949;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, CHARSET);
        System.out.println("1.사원검색 2.급여검색");
        String inputLine = sc.nextLine().trim();
        switch (inputLine) {
            case "1":
                searchEmp(sc);
                break;
            case "2":
                searchSalary(sc);
                break;
            default:
                System.out.println("종료합니다.");
                break;
        }
        sc.close();
    }

    private static void searchSalary(Scanner sc) {
        Long minSalary = null;
        Long maxSalary = null;
        System.out.println("입력한 금액 범위의 사원들을 출력합니다.");
        try {
            System.out.print("최소급여를 입력하세요.\n > ");
            minSalary = Long.parseLong(sc.nextLine().trim());
            System.out.print("최대급여를 입력하세요.\n > ");
            maxSalary = Long.parseLong(sc.nextLine().trim());
            HRDAO dao = new HRDAOImplement();
            List<HRVO> lst = dao.getListFromMinMaxSalary(minSalary, maxSalary);
            for (HRVO node : lst) {
                System.out.printf("%-20s %-20s%n",
                        (node.getFirst_name() + " " + node.getLast_name()),
                        node.getSalary());
            }
            if (lst.size() == 0)
                System.out.println("일치하는 사원이 없습니다.");
        } catch (NumberFormatException e) {
            System.err.println("숫자를 입력하세요");
        }
    }

    private static void searchEmp(Scanner sc) {
        System.out.println("입력한 이름과 일치하는 사원들을 출력합니다.(대소문자 구분 없음)");
        System.out.print("사원 이름을 입력하세요.\n > ");
        String inputLine = sc.nextLine().trim();
        HRDAO dao = new HRDAOImplement();
        List<HRVO> lst = dao.getListFromSearchName(inputLine);
        for (HRVO node : lst) {
            System.out.printf("%-15s %-15s %-15s %-20s %-15s%n",
                    node.getFirst_name(),
                    node.getLast_name(),
                    node.getEmail(),
                    node.getPhone_number(),
                    node.getHire_date());
        }
        if (lst.size() == 0)
            System.out.println("일치하는 사원이 없습니다.");
    }
}

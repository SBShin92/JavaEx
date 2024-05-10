package com.javaex.jdbc.miniproject;

import java.util.List;
import java.util.Scanner;

public class PhoneBookApp {
    private static final String UTF_CHARSET = "UTF-8";
    private static final String CP949_CHARSET = "CP949";
    private static final String CHARSET = CP949_CHARSET;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, CHARSET);
        boolean flag = true;

        displayTitle("전화번호 관리 프로그램");
        checkDatabase();
        while (flag) {
            displayMenu();
            flag = run(sc);
            System.out.println();
        }
        sc.close();
        displayTitle("감사합니다");
    }

    private static void checkDatabase() {
        PhoneBookDAO dao = new PhoneBookDAOImplement();
        if (dao.checkPhoneBookTable()) {
            System.out.println();
            System.out.println("** 새로운 테이블을 생성합니다. **");
            System.out.println();
        }
    }

    private static boolean run(Scanner sc) {
        System.out.print(">메뉴번호: ");
        String inputString = sc.nextLine().trim();
        PhoneBookDAO dao = new PhoneBookDAOImplement();
        while (inputString == "")
            inputString = sc.nextLine().trim();
        System.out.println();
        switch (inputString) {
            case "1":
                displayList(dao);
                break;
                case "2":
                addTupleToTable(dao, sc);
                break;
                case "3":
                deleteTupleToTable(dao, sc);
                break;
                case "4":
                searchNameToTable(dao, sc);
                break;
                case "5":
                return false;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        return true;
    }



    private static void searchNameToTable(PhoneBookDAO dao, Scanner sc) {
        List<PhoneBookVO> lst = dao.getList();

        System.out.println("<4.검색>");
        System.out.print(">이름: ");
        String name = sc.nextLine().trim();
        lst = dao.search(name);
            for (PhoneBookVO node: lst) {
                System.out.printf("%-4d %-6s %-15s %-15s%n",
                    node.getId(), node.getName(), node.getHp(), node.getTel());
            }
            if (lst.size() == 0)
                System.out.println("[정보가 없습니다.]");
    }

    private static void deleteTupleToTable(PhoneBookDAO dao, Scanner sc) {
        System.out.println("<3.삭제>");
        try {
            System.out.print(">번호: ");
            Long id = Long.parseLong(sc.nextLine().trim());
            boolean result = dao.delete(id);
            if (result)
                System.out.println("[삭제되었습니다.]");
            else
                System.out.println("[삭제에 실패했습니다.]");
        } catch (NumberFormatException e) {
            System.err.println("잘못된 입력값입니다.");
        }
    }

    private static void addTupleToTable(PhoneBookDAO dao, Scanner sc) {

        System.out.println("<2.등록>");
        System.out.print(">이름: ");
        String name = sc.nextLine().trim();
        System.out.print(">휴대전화: ");
        String hp = sc.nextLine().trim();
        System.out.print(">집전화: ");
        String tel = sc.nextLine().trim();
        boolean result = dao.insert(name, hp, tel);
        if (result)
            System.out.println("[등록되었습니다.]");
        else
            System.out.println("[등록에 실패했습니다.]");
    }

    private static void displayList(PhoneBookDAO dao) {
        List<PhoneBookVO> lst = dao.getList();

        System.out.println("<1.리스트>");
            for (PhoneBookVO node: lst) {
                System.out.printf("%-4d %-6s %-15s %-15s%n",
                    node.getId(), node.getName(), node.getHp(), node.getTel());
            }
            if (lst.size() == 0)
                System.out.println("[정보가 없습니다.]");
    }


    private static void displayMenu() {
        System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
        System.out.println("------------------------------------------");
    }

    private static void displayTitle(String str) {
        System.out.println("******************************************");
        System.out.printf("*         %-21s*%n", str);
        System.out.println("******************************************");
    }

    

}

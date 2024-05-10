package com.javaex.jdbc.miniproject;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("Database를 삭제하시겠습니까? [Y/n]");
        String inputString = sc.nextLine().trim();
        switch (inputString) {
            case "y":
            case "Y":
                dropDatabase();
                break;
            default:
                break;
        }
        sc.close();
        displayTitle("감사합니다");
    }

    private static void dropDatabase() {
        PhoneBookDAO dao = new PhoneBookDAOImplement();
        if (dao.dropPhoneBookTable()) {
            System.out.println();
            System.out.println("** 데이터베이스를 삭제했습니다. **");
            System.out.println();
        }
        ;
    }

    private static void checkDatabase() {
        PhoneBookDAO dao = new PhoneBookDAOImplement();
        if (dao.checkPhoneBookTable()) {
            System.out.println();
            System.out.println("** 새로운 데이터베이스를 생성합니다. **");
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
        for (PhoneBookVO node : lst) {
            System.out.printf("%2d. %-3s %-15s %-15s%n",
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
            System.out.println();
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
        if (!nameRegex(name)) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.print(">휴대전화: ");
        String hp = sc.nextLine().trim();
        if (!phoneRegex(hp)) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.print(">집전화: ");
        String tel = sc.nextLine().trim();
        if (!phoneRegex(tel)) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        boolean result = dao.insert(name, hp, tel);
        System.out.println();
        if (result)
            System.out.println("[등록되었습니다.]");
        else
            System.out.println("[등록에 실패했습니다.]");
    }

    private static void displayList(PhoneBookDAO dao) {
        List<PhoneBookVO> lst = dao.getList();

        System.out.println("<1.리스트>");
        for (PhoneBookVO node : lst) {
            System.out.printf("%2d. %-3s %-15s %-15s%n",
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

    private static boolean nameRegex(String str) {
        Pattern pattern = Pattern.compile("[가-힣a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            return true;
        return false;
    }

    private static boolean phoneRegex(String str) {
        Pattern pattern = Pattern.compile("[0-9]+-[0-9]+-[0-9]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            return true;
        return false;
    }
}

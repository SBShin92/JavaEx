package com.javaex.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        double result;
        int num;

        System.out.print("정수입력: ");
        Scanner sc = new Scanner(System.in);

        try {
            num = sc.nextInt();
            result = 100 / num; // java.lang.Exception 발생
            System.out.print("100 / 입력값 = ");
            System.out.println(result); // 예외가 발생하면 수행되지 않음
        } catch (InputMismatchException e) {
            System.err.println("정수값을 입력하세요.");
        } catch (ArithmeticException e) {
            System.err.println("0으로는 나눌 수 없습니다.");
        } catch (Exception e) {
            e.printStackTrace(); // 예외 스택 출력
        } finally {
            // try 블록에서 시스템자원을 할당했다면 해제해주자.
            System.out.println("예외처리 종료");
        }
        sc.close();
    }
}

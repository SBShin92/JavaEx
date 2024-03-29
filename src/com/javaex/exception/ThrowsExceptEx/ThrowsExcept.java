package com.javaex.exception.ThrowsExceptEx;

import java.io.IOException;


class CustomArithmeticException extends ArithmeticException {
    private int num1;
    private int num2;
    private String message;

    public CustomArithmeticException(String message, int num1, int num2) {
        super(message);
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}


public class ThrowsExcept {
    public void executeExcept() throws IOException {
        System.out.println("강제예외발생");
        throw new IOException("강제 예외!");
        /*
        CheckedException을 throw 할 때는
        해당 메서드가 CheckedException을 던져준다는 점을
        외부의 메서드에게 알려줘야 한다.
        */
    }

    /* 런타임에러를 처리하는 메서드는 throws를 생략해도 된다. */
    public void executeRuntimeException() {
        System.out.println("런타임 에러");
        throw new RuntimeException("런타임 에러");
    }

    /*
    예외 발생 시, 보다 구체적인 예외로 변환한 후
    예외 상황의 정보를 추가해서 반환하는 것이 좋다.
     */
    public double divide(int num1, int num2) {
        double result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            CustomArithmeticException cae = new
                    CustomArithmeticException("저는 CustomArithmeticException 입니다", num1, num2);
            throw cae;
        }
        return result;
    }
}

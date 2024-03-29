package com.javaex.exception.ThrowsExceptEx;

import java.io.IOException;

/*
  CheckedException: 반드시 예외 처리가 필요하다
  case1. try ~ catch
  case2. throw로 예외 던지기를 한경우
 */
public class ThrowsExceptApp {
    public static void main(String[] args) {
        ThrowsExcept except = new ThrowsExcept();
        try {
            except.divide(50, 0);
            except.executeRuntimeException();
            except.executeExcept();
        } catch (CustomArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("나누어지는 수: " + e.getNum1());
            System.err.println("나누는 수: " + e.getNum2());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("------------");
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}

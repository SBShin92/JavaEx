package com.javaex.exception.ThrowsExcept;

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
            except.executeExcept();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("------------");
            System.err.println(e.getMessage());
        }
    }
}

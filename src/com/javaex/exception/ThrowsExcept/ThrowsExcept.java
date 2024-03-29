package com.javaex.exception.ThrowsExcept;

import java.io.IOException;

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
}

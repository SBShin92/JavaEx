package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamEx {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        InputStream input = null;
        OutputStream output = null;

        try {
            input = new ByteArrayInputStream(inSrc);
            output = new ByteArrayOutputStream();
            int data;

            while ((data = input.read()) != -1) { // 바이트 단위로 읽기
                output.write(data); // 출력스트림에 바이트단위로 쓰기. 버퍼에 저장된다.
                System.out.println("read data? : " + data);
            }

            output.flush();
            outSrc = ((ByteArrayOutputStream)output).toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("inSrc : " + Arrays.toString(inSrc));
        System.out.println("outSrc : " + Arrays.toString(outSrc));
    }
}

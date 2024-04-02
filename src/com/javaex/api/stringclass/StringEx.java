package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        stringBasic();
        System.out.println("---------------\n");
        usefulMethods();
        System.out.println("---------------\n");
    }

    private static void stringBasic() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        char[] letters = {'J', 'a', 'v', 'a'};
        String s4 = new String(letters);
        System.out.println(s4);

        String s5 = String.valueOf(2024);
        System.out.println(s5);
    }

    private static void usefulMethods() {
        String str = "Java Programming is Fun?, it's OO Programming.";
        System.out.println("str 원본: " + str + "\n");

        System.out.println(".length: " + str.length());
        System.out.println("toUpper: " + str.toUpperCase());
        System.out.println("toLower: " + str.toLowerCase());
        System.out.println("charAt(5): " + str.charAt(5));
        /* .indexOf */
        int idx = str.indexOf("Programming");
        System.out.println("\nindex of 'Programming'?(1) : " + idx);
        idx += "Programming".length();
        idx = str.indexOf("Programming", idx);
        System.out.println("index of 'Programming'?(2) : " + idx);
        idx += "Programming".length();
        idx = str.indexOf("Programming", idx);
        System.out.println("index of 'Programming'?(3) : " + idx);
        idx = str.lastIndexOf("Programming");
        System.out.println("lastIndex of 'Programming'? : " + idx);
        /* .substring */
        System.out.println("\nsubstring(5): " + str.substring(5));
        System.out.println("substring(5, 22): " + str.substring(5, 22));
        /* .replace */
        System.out.println("\nreplace(\"Programming\"): " + str.replace("Programming", "coding"));
        /* .trim */
        System.out.println("");
        String str2 = "               Hell o              ";
        String str3 = ", Java";
        System.out.println(str2.trim() + str3);
        /* .split */
        System.out.println("");
        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        for (String data: strArray) {
            System.out.println("분할 출력: " + data);
        }
        /* .compareTo */
        System.out.println("");
        System.out.println("ABC".compareTo("AB")); // 같으면 0, 양수면 > , 음수면 <

    }
}

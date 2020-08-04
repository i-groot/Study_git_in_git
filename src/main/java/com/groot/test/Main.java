package com.groot.test;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

public class Main {

    private static String haha;

    public static void main(String[] args) {
        haha = "haha";
        System.out.println("Hello World.");
        System.out.println("This will be merged.");
        System.out.println(countChar("Hello World.", 'l'));
    }
    
    private static int countChar(String str, char ch) {
        if (Objects.isNull(str)) return 0;
        byte[] bytes = str.getBytes();
        int count = 0;
        for (byte b : bytes) {
            if (b == ch) count++;
        }
        return count;
    }
}

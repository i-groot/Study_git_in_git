package com.groot.test;

import java.util.Objects;

public class Main {

    private static String haha;

    public static void main(String[] args) {
        haha = "haha";
        System.out.println("Hello World.");
        System.out.println("This will be merged.");
        int ans = getAns();
        System.out.println(ans);
        System.out.println(getLength("I am studying."));
    }

    private static int getAns() {
        return 10 + 15;
    }

    private static int getLength(String str) {
        return Objects.isNull(str) ? 0 : str.length();
    }
}

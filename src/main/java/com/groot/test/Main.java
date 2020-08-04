package com.groot.test;

public class Main {

    private static String haha;

    public static void main(String[] args) {
        haha = "haha";
        System.out.println("Hello World.");
        System.out.println("This will be merged.");
        int ans = getAns();
        System.out.println(ans);
    }

    private static int getAns() {
        return 10 + 15;
    }
}

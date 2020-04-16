package com.company;

public class Main {

    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        test(1, "+1", true);
        test(2, "+123123", true);
        test(3, "-123123", true);
        test(4, "+0", true);
        test(5, "-0", true);
        test(6, "+123.123", true);
        test(7, "-123.123", true);
        test(8, "0.", true);
        test(9, "-0.0", true);
        test(10, "+0.0", true);
        test(11, "+0.0.0", false);
        test(12, "123.123.123", false);
        test(13, ".123", true);
        test(14, "0.123.123", false);
        test(15, "+123.+123", false);
        test(16, "+123.-123", false);
        test(17, "+123.+123.", false);
        test(18, "-123.+123.+", false);
        test(19, "-+123.123", false);
        test(20, "+1-23.123", false);
        test(21, ".1", true);
        test(22, "", false);
        test(23, ".", false);
    }

    private static void test(Integer testIndex, String string, boolean actual) {
        if (Machine.check(string) == actual) {
            System.out.println("Test number " + testIndex + ". Right answer | " + string + ": " + actual);
        } else {
            System.err.println("Test number " + testIndex + ". Wrong answer | " + string + ": " + !actual);
        }
    }
}

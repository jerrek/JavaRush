package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        String methodName = "";
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        methodName = stackTraceElements[2].getMethodName();
        return methodName;
    }

    public static String method2() {
        method3();
        String methodName = "";
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        methodName = stackTraceElements[2].getMethodName();
        return methodName;
    }

    public static String method3() {
        method4();
        String methodName = "";
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        methodName = stackTraceElements[2].getMethodName();
        return methodName;
    }

    public static String method4() {
        method5();
        String methodName = "";
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        methodName = stackTraceElements[2].getMethodName();
        return methodName;
    }

    public static String method5() {
        String methodName = "";
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        methodName = stackTraceElements[2].getMethodName();
        return methodName;
    }
}

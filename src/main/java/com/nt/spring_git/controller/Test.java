package com.nt.spring_git.controller;

import com.nt.spring_git.SpringGitApplication;
import org.springframework.boot.SpringApplication;

public class Test {
    public static void main(String[] args) {
        SpringApplication.run(SpringGitApplication.class, args);
        System.out.println("Hello World");
    }
    double sum(double a, double b) {
        return a+b;
    }
    int substraction(int a, int b) {
        return a*b;
    }

    int division(int a, int b) {
        return a/b;
    }

    int mul(int a, int b) {
        System.out.println("multiply");
        System.out.println("Test.mul");
        return a*b+908+65-98;
    }
}

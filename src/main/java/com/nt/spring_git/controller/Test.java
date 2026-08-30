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
}

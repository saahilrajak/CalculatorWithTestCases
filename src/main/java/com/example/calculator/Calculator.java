package com.example.calculator;

import org.springframework.stereotype.Component;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a,int b){
        return a/b;
    }

    public int totalSum(int ...nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

    public boolean isEven(int a){
        return a%2 == 0;
    }
}

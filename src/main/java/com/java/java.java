package com.java;

public class java {

    public static int f(int i){
        i=i-1;
        if (i>1){
            return f(i)+f(i-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println(java.f(a));
    }
}

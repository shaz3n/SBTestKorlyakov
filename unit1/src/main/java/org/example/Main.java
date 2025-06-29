package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2(21, 7);
        task3("Поп");
        task4(123);
        task5();
    }

    public static void task1(){
        System.out.println("Hello world!");
    }

    public static void task2(int a, int b){
        int ans = a / b;
        int ost = a % b;
        System.out.println(a + " / " + b + " = " + ans + " и " + ost + " в остатке");
    }

    public static void task3(String s){
        char[] ch = s.toLowerCase().toCharArray();
        int len = ch.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(!(ch[i] == ch[len-i-1])){
                count++;
            }
        }
        if(count==0){
            System.out.println(s + " полиндром");
        }else{
            System.out.println(s + " не полиндром");
        }
    }

    public static void task4(int n){
        int ans = (n/100) + ((n/10)%10) + (n%10);
        System.out.println(ans);
    }

    public static void task5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Вес на Земле: ");
        double earth =  sc.nextInt();
        double moon = earth * 0.17;
        System.out.println("Вес на Луне: " + moon);
    }
}

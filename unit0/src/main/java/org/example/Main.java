package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Korlyakov Denis");

        task1();
        task2(21, 7);
        task3("Поп");
        task4(123);
        task5();

        //телефоны проверка
        Phone phone1 = new Phone("123456789", "Samsung", 0.5);
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone3);
        phone1.receiveCall("Мария", "555777888");
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        String[] numbers = {"1112", "222", "333"};
        phone3.sendMessage(numbers);

        //круг проверка
        Circle c1 = new Circle(5.0, "Красный");
        Circle c2 = new Circle(10.0, "Синий");
        System.out.println(c1.area());
        System.out.println(c2.perimeter());

        //книги проверка
        Author author = new Author("Мураками", "murakami@mail.ru");
        Book book = new Book("Охота на овец", author, 2020);
        System.out.println(book);
        author.setEmail("murakami.new@mail.ru");
        System.out.println("Обновлённый email: " + book.getAuthor().getEmail());


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
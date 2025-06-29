package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
}
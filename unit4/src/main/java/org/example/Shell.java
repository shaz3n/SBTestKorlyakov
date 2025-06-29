package org.example;
import java.util.Scanner;

public class Shell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду (help для списка команд): ");

        while(true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            Command command = AllCommands.getCommand(input);
            command.execute();
        }
    }
}

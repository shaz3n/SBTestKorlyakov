package org.example;
import java.util.Scanner;

public class Shell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandReg registry = new CommandReg("org.example.commands");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) continue;

            String[] tokens = input.split("\\s+");
            String cmdName = tokens[0];
            String[] cmdArgs = java.util.Arrays.copyOfRange(tokens, 1, tokens.length);

            if (cmdName.equals("exit")) break;

            Command cmd = registry.getCommand(cmdName);
            if (cmd != null) {
                try {
                    cmd.exec(cmdArgs);
                } catch (CommandExecutionException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else {
                System.out.println("Неизвестная команда: " + cmdName);
            }
        }

        System.out.println("Завершено");
    }
}
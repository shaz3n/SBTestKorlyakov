package org.example;
import java.util.*;

public class Shell {
    public static void main(String[] args) {
        Map<String, Command> commands = new HashMap<>();

        commands.put("date", new DateCommand());
        commands.put("time", new TimeCommand());
        commands.put("pwd", new PwdCommand());
        commands.put("exit", new ExitCommand());
        commands.put("help", new HelpCommand(commands));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду (help для списка команд): ");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            Command cmd = commands.getOrDefault(input, new UnknowCommand(input));
            cmd.execute();
        }
    }
}
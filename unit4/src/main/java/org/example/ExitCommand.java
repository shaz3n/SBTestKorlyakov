package org.example;

public class ExitCommand implements Command {
    public String getName() {
        return "exit";
    }

    public String getDescription() {
        return "завершает работу";
    }

    public void execute() {
        System.out.println("Завершение работы");
        System.exit(0);
    }
}
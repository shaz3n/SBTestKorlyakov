package org.example;

public class ExitCommand implements Command {
    public void execute() {
        System.out.println("Завершение работы :'( ");
        System.exit(0);
    }
}
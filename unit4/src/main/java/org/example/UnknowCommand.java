package org.example;

public class UnknowCommand implements Command {
    private String command;
    public UnknowCommand(String command) {
        this.command = command;
    }

    public void execute() {
        System.out.println("Ошибка: неизвестная команда '" + command + "'");
    }
}
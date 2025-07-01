package org.example;

public class UnknowCommand implements Command {
    private String input;

    public UnknowCommand(String input) {
        this.input = input;
    }

    public String getName() {
        return "unknown";
    }

    public String getDescription() {
        return "неизвестная команда";
    }

    public void execute() {
        System.out.println("Ошибка: неизвестная команда '" + input + "'");
    }
}
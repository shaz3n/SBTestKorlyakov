package org.example;
import java.util.Map;

public class HelpCommand implements Command {
    private Map<String, Command> commandMap;

    public HelpCommand(Map<String, Command> commandMap) {
        this.commandMap = commandMap;
    }

    public String getName() {
        return "help";
    }

    public String getDescription() {
        return "выводит список доступных команд";

    }

    public void execute() {
        System.out.println("Доступные команды:");
        for (Command cmd : commandMap.values()) {
            System.out.printf("\n", cmd.getName(), cmd.getDescription());
        }
    }
}
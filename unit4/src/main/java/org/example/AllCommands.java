package org.example;

public class AllCommands {
    public static Command getCommand(String inp) {
        switch (inp) {
            case "date":
                return new DateCommand();
            case "time":
                return new TimeCommand();
            case "pwd":
                return new PwdCommand();
            case "help":
                return new HelpCommand();
            case "exit":
                return new ExitCommand();
            default:
                return new UnknowCommand(inp);
        }
    }
}
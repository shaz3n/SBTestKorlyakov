package org.example;

public class CommandExecutionException extends Exception {
    private final String comName;

    public CommandExecutionException(String comName, String message) {
        super(message);
        this.comName = comName;
    }

    public String getCommandName() {
        return comName;
    }
}
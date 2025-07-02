package org.example.commands;
import org.example.CommandInfo;
import org.example.Command;

@CommandInfo(name = "pwd", description = "Показфвает текущую директорию")
public class PwdCommand implements Command {
    @Override
    public void exec(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
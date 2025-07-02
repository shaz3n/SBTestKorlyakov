package org.example.commands;
import org.example.CommandInfo;
import org.example.Command;

@CommandInfo(name = "time", description = "Выводит текущее время")
public class TimeCommand implements Command {
    @Override
    public void exec(String[] args) {
        System.out.println(java.time.LocalTime.now());
    }
}

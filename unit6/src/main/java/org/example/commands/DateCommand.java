package org.example.commands;
import org.example.CommandInfo;
import org.example.Command;

@CommandInfo(name = "date", description = "Выводит текущую дату")
public class DateCommand implements Command {
    @Override
    public void exec(String[] args) {
        System.out.println(java.time.LocalDate.now());
    }
}
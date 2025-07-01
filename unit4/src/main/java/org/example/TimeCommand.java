package org.example;
import java.time.LocalTime;

public class TimeCommand implements Command {
    public String getName() {
        return "time";
    }

    public String getDescription() {
        return "выводит текущее время";
    }

    public void execute() {
        System.out.println(LocalTime.now());
    }
}
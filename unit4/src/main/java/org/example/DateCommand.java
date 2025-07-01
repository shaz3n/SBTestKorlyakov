package org.example;
import java.time.LocalDate;

public class DateCommand implements Command {
    public String getName() {
        return "date";
    }

    public String getDescription() {
        return "выводит текущую дату";
    }

    public void execute() {
        System.out.println(LocalDate.now());
    }
}
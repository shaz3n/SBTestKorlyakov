package org.example;
import java.time.LocalDate;

public class DateCommand implements Command {
    public void execute() {
        System.out.println(LocalDate.now());
    }
}
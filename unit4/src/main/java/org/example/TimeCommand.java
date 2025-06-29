package org.example;
import java.time.LocalTime;

public class TimeCommand implements Command {
    public void execute() {
        System.out.println(LocalTime.now());
    }
}
package org.example;
import java.nio.file.Paths;

public class PwdCommand implements Command {
    public void execute() {
        System.out.println(Paths.get("").toAbsolutePath());
    }
}
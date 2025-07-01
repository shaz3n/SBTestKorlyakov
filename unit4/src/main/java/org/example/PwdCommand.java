package org.example;
import java.nio.file.Paths;

public class PwdCommand implements Command {
    public String getName() {
        return "pwd";
    }

    public String getDescription() {
        return "выводит текущий каталог";
    }

    public void execute() {
        System.out.println(Paths.get("").toAbsolutePath());
    }
}
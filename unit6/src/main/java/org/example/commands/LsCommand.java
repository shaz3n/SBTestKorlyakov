package org.example.commands;
import org.example.Command;
import org.example.CommandInfo;
import org.example.CommandExecutionException;
import java.io.File;

@CommandInfo(name = "ls", description = "Вывод содержимого текущей директории")
public class LsCommand implements Command {
    @Override
    public void exec(String[] args) throws CommandExecutionException {
        String currentDir = System.getProperty("user.dir");
        File dir = new File(currentDir);

        File[] files = dir.listFiles();
        if (files == null) {
            throw new CommandExecutionException("ls", "Не удалось распознатб директорию");
        }

        for (File file : files) {
            System.out.print(file.getName() + (file.isDirectory() ? "/" : ""));
        }
    }
}
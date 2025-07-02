package org.example.commands;
import org.example.Command;
import org.example.CommandInfo;
import org.example.CommandExecutionException;
import java.io.File;

@CommandInfo(name = "cd", description = "Смена текущей рабочей директории")
public class CdCommand implements Command {
    @Override
    public void exec(String[] args) throws CommandExecutionException {
        if (args.length == 0) {
            throw new CommandExecutionException("cd", "Укажите путь к директории");
        }

        File dir = new File(args[0]);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new CommandExecutionException("cd", "Директтория не найдена " + args[0]);
        }

        System.setProperty("user.dir", dir.getAbsolutePath());
    }
}
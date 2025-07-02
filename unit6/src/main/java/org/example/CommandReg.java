package org.example;
import org.reflections.Reflections;
import java.util.*;

public class CommandReg {
    private final Map<String, Command> commands = new HashMap<>();

    public CommandReg(String basePackage) {
        Reflections reflections = new Reflections(basePackage);

        Set<Class<? extends Command>> commandClasses = reflections.getSubTypesOf(Command.class);

        for (Class<? extends Command> clazz : commandClasses) {
            CommandInfo info = clazz.getAnnotation(CommandInfo.class);
            if (info != null) {
                try {
                    Command cmd = clazz.getDeclaredConstructor().newInstance();
                    commands.put(info.name(), cmd);
                } catch (Exception e) {
                    System.err.println("Ошибка инициализации команды: " + clazz.getName());
                }
            }
        }
    }

    public Command getCommand(String name) {
        return commands.get(name);
    }

    public Set<String> listCommands() {
        return commands.keySet();
    }
}
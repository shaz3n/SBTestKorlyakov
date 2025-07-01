package org.example;

public interface Command {
    String getName();
    String getDescription();
    void execute();
}
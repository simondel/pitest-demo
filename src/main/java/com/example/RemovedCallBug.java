package com.example;

public class RemovedCallBug {

    boolean doSomething() {
        return true;
    }

    boolean canExecuteEverything(String command) {
        if (command.startsWith("test")) {
            return command.length() < 25;
        }

        return !command.isEmpty();
    }
}

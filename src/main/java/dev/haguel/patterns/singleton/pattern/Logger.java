package dev.haguel.patterns.singleton.pattern;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private List<String> logs;

    private Logger() {
        instance = this;
        this.logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        return instance == null ? new Logger() : instance;
    }

    public void log(String message) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String formattedTime = time.format(formatter);
        String log = formattedTime + " " + message;

        logs.add(log);
    }

    public void showLogs() {
        logs.stream().forEach(System.out::println);
    }
}

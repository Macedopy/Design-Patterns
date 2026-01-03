package design.pattern.singleton;

import java.util.Date;

public class Logger {
    private String logFile;
    private static Logger instance;

    private static FileHandler fileHandler;
    private static final Date date = new Date();

    // constructor need to be private for singleton
    private Logger() {
        this.logFile = "app.log";
        fileHandler = new FileHandler();
    }

    //Need to create the getInstance method for singleton
    public static Logger getInstance() {
        // The Logger.instance is to access the global class instead of "this" to access the object
        if (Logger.instance == null) {
            Logger.instance = new Logger();
        }

        return Logger.instance;
    }

    public static void log(String logFile, String message) {
        fileHandler.writeFile(logFile, message.isEmpty() ? date.toString() : message);
    }

}

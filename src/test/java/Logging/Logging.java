package Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    private static Logger logger;

    public static void startLogger()  {
        logger = Logger.getGlobal();
        FileHandler fh = null;
        try {
            fh = new FileHandler("./src/log.log");
        } catch (IOException e) {
            throw new RuntimeException();
        }
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
    public static Logger getLogger() {
        if (logger == null) {Logging.startLogger();}
        return logger;
    }
}

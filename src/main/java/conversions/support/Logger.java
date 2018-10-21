package conversions.support;

public class Logger {
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);

    public static org.apache.log4j.Logger getLogger() {
        return logger;
    }
}

package Log4JLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyErrorLog {

    private static final Logger logger = LoggerFactory.getLogger(MyErrorLog.class);

    public static void printError(){
        logger.info("{}, {}, info", "hello", "world");
        logger.warn("{}, {}, warn", "hello", "world");
        logger.error("{}, {}, error", "hello", "world");
        logger.debug("{}, {}, debug", "hello", "world");

    }
}

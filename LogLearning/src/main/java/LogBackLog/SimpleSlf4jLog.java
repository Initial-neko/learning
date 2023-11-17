package LogBackLog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class SimpleSlf4jLog {


    public static void main(String[] args) {

        //如果没有日志实现，也没有导入simple log，那么就会出现问题，直接不输出任何日志
        Logger logger = LoggerFactory.getLogger(SimpleSlf4jLog.class);
        logger.info("nekonekoneko: {}", "neko");

    }
}

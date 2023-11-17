package Log4JLog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1. 验证对应的log方法，以及对应类的log输出
 * 2. 验证rolling的文件大小以及文件数目
 * 3. 对主要的log输出方式进行测试，至少要能看懂其他log properties的情况
 * 4. log4j layout
 */
public class Log4jMain {

    private static final Logger logger = LoggerFactory.getLogger(Log4jMain.class);

    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 1; i++) {
            logger.info("{}, {}, info", "hello", "world");
            logger.warn("{}, {}, warn", "hello", "world");
            logger.error("{}, {}, error", "hello", "world");
            logger.debug("{}, {}, debug", "hello", "world");
//            Thread.sleep(10000);

            MyErrorLog.printError();
        }
    }
}

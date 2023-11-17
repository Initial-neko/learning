package JavaNativeLog;

import Util.PathUtil;

import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * java自带的工具类，since JDK 1.4
 * 可能在测试中能用到一点，基本不使用，而且日志格式名称不同，配置文件不方便等
 * 配置需要写代码
 * 输出到文件过于冗余，和java序列化类似，可以进行测试使用，正式环境使用log4j
 */
public class MAIN {

    public static void main(String[] args) throws IOException {
        final Logger logger = Logger.getLogger("MAIN");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        String path = PathUtil.getResourcesPath() + "javaLog.txt";

        FileHandler fileHandler = new FileHandler(path, false);
        fileHandler.setLevel(Level.SEVERE);
        logger.addHandler(fileHandler);

        logger.setLevel(Level.FINEST);
        logger.info("12312312" + "2321");
        logger.warning("warning!");
        logger.severe("severe!!!!!!!!");
        logger.fine("fine!!!!!!!!");
    }
}

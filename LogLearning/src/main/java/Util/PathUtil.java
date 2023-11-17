package Util;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class PathUtil {

    public static String getResourcesPath(){
        String projectPath = System.getProperty("user.dir");
        String projectName = "LogLearning";
        return projectPath + "/" + projectName + "/" + "src/main/resources/";
    }
}

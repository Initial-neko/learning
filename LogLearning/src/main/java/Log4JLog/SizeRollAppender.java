package Log4JLog;

import org.apache.log4j.RollingFileAppender;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SizeRollAppender extends RollingFileAppender {
    public static void main(String[] args) {

        int maxBackupIndex = 3;
        String fileName = "resources/dayRollLog.txt";
        System.out.println("current fileName:" + fileName);
        File file = new File(fileName);
        final List<File> collect = Arrays.stream(Objects.requireNonNull(file.getParentFile().listFiles()))
                .filter((file0) -> file0.getAbsolutePath().contains(fileName))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        if(collect.size() > maxBackupIndex + 1) {
            List<File> deleteFile = collect.subList(maxBackupIndex + 1, collect.size());
            System.out.println("待删除的列表");
            deleteFile.forEach(System.out::println);
        }

    }


}

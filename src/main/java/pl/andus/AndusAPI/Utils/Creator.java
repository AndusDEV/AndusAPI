package pl.andus.AndusAPI.Utils;

import java.io.File;

public class Creator {
    public static void CreateFolder(String folderName, String folderPath) {
        String path = folderPath + folderName;
        File file = new File(path);
        boolean bool = file.mkdir();
        if (bool) {
            Logger.info("Folder " + folderName + " created successfully.");
        } else {
            Logger.error("Something went wrong :( ");
        }
    }

    public static void CreateFile(String fileName, String filePath) {
        String path = filePath + fileName;
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                Logger.info("File " + fileName + " created successfully.");
            } else {
                Logger.info("File already exists.");
            }
        } catch (Exception e) {
            Logger.error(e.toString());
        }
    }
}

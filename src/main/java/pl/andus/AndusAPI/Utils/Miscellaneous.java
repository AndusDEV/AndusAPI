package pl.andus.AndusAPI.Utils;

import java.awt.*;
import java.net.URL;

public class Miscellaneous {
    static String os = System.getProperty("os.name").toLowerCase();

    public static void OpenWebsite(String siteUrl) {
        try {
            Desktop.getDesktop().browse(new URL(siteUrl).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String CheckOS() {
        if (isWin()) {
            Logger.info("Running on Windows " + "(" + os + ")");
        } else if (isMac()) {
            Logger.info("Running on MacOS" + "(" + os + ")");
        } else if (isUnix()) {
            Logger.info("Running on Unix/Linux" + "(" + os + ")");
        } else if (isSol()) {
            Logger.info("Running on Solaris" + "(" + os + ")");
        }

        return os;
    }

    public static boolean isWin() {
        return (os.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (os.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (os.indexOf("nix") >= 0
                || os.indexOf("nux") >= 0
                || os.indexOf("aix") >= 0);
    }

    public static boolean isSol() {
        return (os.indexOf("sunos") >= 0);
    }
}

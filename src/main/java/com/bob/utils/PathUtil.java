package com.bob.utils;

/**
 * @author bob
 * @date 2019/6/19 18:02
 */
public class PathUtil {
    public static String seperator = System.getProperty("file.seperator");

    //图片目录初始地址
    public static String getImageBasePath() {
        String os = System.getProperty("os.name");
        String path = "";
        if (os.toLowerCase().startsWith("win")) {
            path = "d:/bob/o2o/image";
        }else
            path = "/home/o2o/image";
        return path;

    }
}

package com.bob.utils;

import com.bob.dto.ImageHolder;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 生成商店缩略图
 * 产品详情图
 * @author bob
 * @date 2019/6/19 18:08
 */
public class ImageUtil {

    //随机数
    private static Random r = new Random();
    //时间
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    //classpath
    private static String classpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    //缩略图
    public static String generateThumbnail(ImageHolder imageHolder, String targetAddr) {
        //1.targetAddr是否存在，不存在创建
        makeDir(targetAddr);
        //2.生成随机文件名
        String randomName = getRandomFileName();
        //3.获得文件名后缀
        String fileExtension = getFileExtension(imageHolder.getImageName());
        String relativeAddr = targetAddr+"/"+randomName+fileExtension;
        File file = new File(PathUtil.getImageBasePath() + relativeAddr);
        try {
            Thumbnails.of(imageHolder.getImage())
                    .size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(classpath+"/water.png")),0.5f)
                    .outputQuality(0.8f).toFile(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("缩略图创建失败");
        }
        return relativeAddr;
    }

    //生成详情图 ，图片质量高一些
    public static String generateNormalImage(ImageHolder imageHolder, String targetAddr) {
        //1.targetAddr是否存在，不存在创建
        makeDir(targetAddr);
        //2.生成随机文件名
        String randomName = getRandomFileName();
        //3.获得文件名后缀
        String fileExtension = getFileExtension(imageHolder.getImageName());
        String relativeAddr = targetAddr+"/"+randomName+fileExtension;
        File file = new File(PathUtil.getImageBasePath() + relativeAddr);
        try {
            Thumbnails.of(imageHolder.getImage())
                    .size(337, 640)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(classpath+"/water.png")),0.5f)
                    .outputQuality(0.9f).toFile(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("缩略图创建失败");
        }
        return relativeAddr;
    }


    public static void makeDir(String targetAddr) {
        File dir = new File(PathUtil.getImageBasePath()+targetAddr);
        if(!dir.exists()){
            dir.mkdirs();
        }
    }

    public static String getRandomFileName() {
        int randomNum = r.nextInt(89999) + 10000;
        String timeStr = sdf.format(new Date());
        return timeStr+randomNum;
    }

    public static String getFileExtension(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf("."));
        return  extension;
    }

    public static void main(String[] args) {
//        System.out.println(getFileExtension("aa.jpg"));
//        System.out.println(getRandomFileName());
//        makeDir("/test");
        try{
            File file = new File("d:/bob/test/test.png");
            InputStream is = new FileInputStream(file);

            System.out.println(file.getName());
            ImageHolder imageHolder = new ImageHolder(is, file.getName());

            String s = generateNormalImage(imageHolder, "/test");
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

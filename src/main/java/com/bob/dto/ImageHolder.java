package com.bob.dto;

import java.io.InputStream;

/**
 * @author bob
 * @date 2019/6/19 17:49
 */
public class ImageHolder {
    private String imageName;
    private InputStream image;

    public ImageHolder(InputStream image,String imageName) {
        this.imageName = imageName;
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}

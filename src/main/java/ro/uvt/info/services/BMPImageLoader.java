package ro.uvt.info.services;

import ro.uvt.info.models.*;

public class BMPImageLoader implements ImageLoader{

    @Override
    public ImageContent load(String s) {
        System.out.println("Creating BMPImage");
        return new ImageContent(s);
    }
}

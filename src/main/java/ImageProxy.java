import java.awt.*;

public class ImageProxy implements Element, Picture {
    private final String url;
    private Image realImg;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if(realImg == null){
            realImg = new Image(url);
        }

        return realImg;
    }

    public String url(){
        return url;
    }

    public void print(){
        loadImage();
        realImg.print();
    }


    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int el) {
        throw new UnsupportedOperationException();
    }
}

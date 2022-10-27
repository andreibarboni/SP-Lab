import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private final String url;

    public Image(String name) {
        this.url = name;

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override
    public String url() {
        return url;
    }
}

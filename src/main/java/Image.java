public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
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
        System.out.println("Image: " + imageName);
    }
}

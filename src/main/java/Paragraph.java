public class Paragraph implements Element{
    private final String text;

    public Paragraph(String text) {
        this.text = text;
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

    public String getText() {
        return text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

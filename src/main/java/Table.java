public class Table implements Element{
    private final String name;

    public Table(String name) {
        this.name = name;
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
        System.out.println("Table: " + name);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private final String title;
    private final List<Element> elementList = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        elementList.add(element);
    }

    @Override
    public void remove(Element element) {
        elementList.remove(element);
    }

    @Override
    public Element get(int el) {
        return null;
    }
    public void print(){
    }
}

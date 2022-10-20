import javax.lang.model.util.Elements;
import java.util.*;

public class Section implements Element {
    protected String title;
    private List<Element> elementList = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element:elementList) {
            element.print();
        }
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
        return elementList.get(el);
    }
}

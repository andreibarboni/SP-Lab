import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String name;

    private final List<Element> elementList = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewImage(String img) {
        Image image = new Image(img);
        elementList.add(image);
    }

    public void createNewParagraph(String prg) {
        Paragraph paragraph = new Paragraph(prg);
        elementList.add(paragraph);
    }

    public void createNewTable(String tbl) {
        Table table = new Table(tbl);
        elementList.add(table);
    }

    public void print() {
        System.out.println(name);
        for (Element el:elementList) {
            el.print();
        }
    }
}

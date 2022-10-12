import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> imageList;
    private List<Paragraph> paragraphList;
    private List<Table> tableList;

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewImage(Image image) {
        imageList.add(image);
    }

    public void createNewParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public void createNewTable(Table table) {
        tableList.add(table);
    }

    public void print() {
        System.out.println("Subchapter:" + name +
                "\nImage with name: " + imageList +
                "\nParagraph: " + paragraphList +
                "\nTable with Title: " + tableList);
    }
}

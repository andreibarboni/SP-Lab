import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int createSubChapter(String subchp) {
        SubChapter subchapter = new SubChapter(subchp);
        subChapterList.add(subchapter);

        return subChapterList.indexOf(subchapter) + 1;
    }

    public SubChapter getSubChapter(int subchapter) {
        return new SubChapter("Subcapitolul " + subchapter);
    }

    public void print() {
        System.out.println(name);
    }
}

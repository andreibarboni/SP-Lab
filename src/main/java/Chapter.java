import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;

    private int chp = 0;

    private final List<SubChapter> subChapterList = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
        this.chp = chp + 1;
    }


    public int getChp() {
        return chp;
    }

    public int createSubChapter(String subchp) {
        SubChapter subchapter = new SubChapter(subchp);
        subChapterList.add(subchapter);

        return subChapterList.indexOf(subchapter) + 1;
    }

    public SubChapter getSubChapter(int subchapter) {
        return new SubChapter("Subcapitolul: " + getChp() + "." + subchapter);
    }

    public void print() {
    }
}

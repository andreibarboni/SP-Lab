import java.util.List;

public class Chapter {
    private String name;
    private List<String> subChapterList;

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subchapter){
        subChapterList.add(subchapter);
        return subChapterList.indexOf(subchapter);
    }

    public SubChapter getSubChapter(int subchapter) {
        return new SubChapter(subChapterList.get(subchapter));
    }

    public void print() {

    }
}

import java.util.List;

public class Chapter {
    private String name;
    private List<String> subChapterList;

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subchapter){
        subChapterList.add(subchapter);
        SubChapter subchp = new SubChapter(subchapter);

        return subChapterList.indexOf(subchp);
    }

    public SubChapter getSubChapter(int subchapter) {
        return new SubChapter("Subcapitolul" + name +"." + subchapter);
    }

    public void print() {

    }
}

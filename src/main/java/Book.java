import java.util.*;

public class Book {
    private String title;
    private List<Author> authorList =  new ArrayList<Author>();
    public List<Chapter> chapterList = new ArrayList<Chapter>();


    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authorList.add(author);
    }

    public int createChapter(String chapter) {
        Chapter chp = new Chapter(chapter);
        chapterList.add(chp);

        return chapterList.indexOf(chp);
    }

    public Chapter getChapter(int chapter) {
        return new Chapter("Capitolul" + chapter);
    }

    public void print() {
        System.out.println("Titlul cartii este " + title);
    }
}

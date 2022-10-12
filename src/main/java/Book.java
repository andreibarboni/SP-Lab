import java.util.*;

public class Book {
    private String title;
    private List<Author> authorList;
    private List<Chapter> chapterList;


    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authorList.add(author);
    }

    public int createChapter(Chapter chapter){
        chapterList.add(chapter);
        return chapterList.indexOf(chapter);
    }

    public Chapter getChapter(int chapter) {
        return new Chapter("Capitolul" + chapter);
    }

    public void print() {
        System.out.println("Titlul cartii este " + title);
    }
}

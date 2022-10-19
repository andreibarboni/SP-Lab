import java.util.*;

public class Book extends Section {
    private final List<Author> authorList = new ArrayList<Author>();
    private final List<Element> elementList = new ArrayList<Element>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author){
        authorList.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors: \n");
        for (Author author:authorList) {
            System.out.println(author);
        }
    }

    public void addContent(Element element) {
        elementList.add(element);
    }

    public void removeContent(Element element) {
        elementList.remove(element);
    }

    public Element getContent(int el) {
        return elementList.get(el);
    }
}

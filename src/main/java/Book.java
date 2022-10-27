import java.util.*;

public class Book extends Section {
    private List<Author> authorList = new ArrayList<Author>();
    private List<Element> elementList = new ArrayList<Element>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author){
        authorList.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + "\n");

        System.out.println("Authors:");
        for (Author author:authorList) {
            author.print();
            System.out.println("\n");
        }

        for (Element element:elementList) {
            element.print();
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

package ro.uvt.info;

import ro.uvt.info.models.*;

import ro.uvt.info.services.*;

public class Main {
    public static void Printing(){
        DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) throws Exception {
        Book myBook = new Book("My Book");
        myBook.addContent(new Paragraph("Bla bla bla"));
        Author me = new Author("My Self");
        myBook.addAuthor(me);
        DocumentManager.getInstance().setBook(myBook);
        Printing();
    }
}

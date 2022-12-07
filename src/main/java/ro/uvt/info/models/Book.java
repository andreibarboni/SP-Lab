package ro.uvt.info.models;

import ro.uvt.info.services.*;

import java.util.ArrayList;

public class Book implements Visitee {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Element> content= new ArrayList<>();
    public Book(String name) {
        this.title = name;
    }


    public void print()
    {
        System.out.print(this.title);
        System.out.print("\n");
        System.out.print("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        System.out.print("\n");
        for (Element element:content) {
            element.print();
        }
    }
    public void addAuthor(Author a)
    {
        if(authors==null)
            authors=new ArrayList<>();
        authors.add(a);
    }

    public void addContent(Element element){

        this.content.add(element);
    }

    @Override
    public void accept(BookSaveVisitor bookSaveVisitor) {
        bookSaveVisitor.visitBook(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public ArrayList<Element> getContent() {
        return content;
    }

    public void setContent(ArrayList<Element> content) {
        this.content = content;
    }
}

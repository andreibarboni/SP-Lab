package ro.uvt.info.models;


import ro.uvt.info.services.*;

public class TableOfContents implements Element, Visitee {
    //public void print()
    {
        System.out.println("Mesaj");
    }

    @Override
    public void add(Element element) {
        //Nu trebuie sa le implementam
    }

    @Override
    public void remove(Element element) {
        //Nu trebuie sa le implementam

    }

    @Override
    public Element get(int index) {
        //Nu trebuie sa le implementam
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
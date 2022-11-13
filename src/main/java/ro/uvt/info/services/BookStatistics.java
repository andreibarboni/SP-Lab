package ro.uvt.info.services;

import ro.uvt.info.models.*;

import java.util.ArrayList;

public class BookStatistics implements BookSaveVisitor{
    private int numberBooks = 0;
    private int numberSections = 0;
    private int numberImages = 0;
    private int numberTable = 0;
    private int numberTableOfContents = 0;
    private int numberParagraph = 0;
    @Override
    public void visitBook(Book book) {
        numberBooks++;
        ArrayList<Element> elements = book.getContent();

        for(Element e: elements){
            if (e instanceof Visitee){
                Visitee visitee = (Visitee) e;
                visitee.accept(this);
            }
        }
    }

    @Override
    public void visitSection(Section section) {
        numberSections++;
        ArrayList<Element> elements = section.getElements();

        for(Element e: elements){
            if (e instanceof Visitee){
                Visitee visitee = (Visitee) e;
                visitee.accept(this);
            }
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        numberTableOfContents++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        numberImages++;
    }

    @Override
    public void visitImage(Image image) {
        numberImages++;
    }

    @Override
    public void visitTable(Table table) {
        numberTable++;
    }

    public void printStatistics() {
        System.out.println("Book of statistics:");
        System.out.println("*** Number of images: " + numberImages);
        System.out.println("*** Number of tables: " + numberTable);
        System.out.println("*** Number of paragraphs: " + numberParagraph);
    }
}
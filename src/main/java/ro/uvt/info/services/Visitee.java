package ro.uvt.info.services;

public interface Visitee {
    public void accept(Visitor visitor);
    public void accept(BookSaveVisitor bookSaveVisitor);
}

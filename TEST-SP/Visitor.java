public interface Visitor {
    void visitSubcomanda(Subcomanda subcomanda, int cost);
    void visitPizza(Pizza pizza, int cost);
    void visitPaste(Paste paste, int cost);
    void visitSalata(Salata salata, int cost);
}

public interface Comanda {
    void print();
    void add(Comanda comanda);
    void remove(Comanda comanda);
    Comanda get(int i);
    void accept(Visitor vizitor);
}

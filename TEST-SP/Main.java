public class Main {
    public static void main(String[] args) {
        Subcomanda subcomanda = new Subcomanda("Marea Comanda");
        Pizza pizza = new Pizza("Quattro Fromaggi", 20);
        Paste paste = new Paste("Carbonara", 15);
        Salata salata = new Salata("Greceasca", 20);

        subcomanda.add(pizza);
        subcomanda.add(salata);
        ComandaStats stats = new ComandaStats();
        subcomanda.accept(stats);

        subcomanda.print();
        stats.getStats();

        subcomanda.add(paste);
        subcomanda.print();

        ComandaStats stats2 = new ComandaStats();
        subcomanda.accept(stats2);
        stats2.getStats();

        subcomanda.remove(pizza);
        subcomanda.remove(paste);
        subcomanda.print();

        ComandaStats stats3 = new ComandaStats();
        subcomanda.accept(stats3);
        stats3.getStats();
    }
}

public class Paste implements Comanda, Visitee{
    private final String Name;
    private  int cost;

    public Paste(String name, int cost) {
        this.Name = name;
        this.cost = cost;
    }


    @Override
    public void print() {

    }

    @Override
    public void add(Comanda comanda) {

    }

    @Override
    public void remove(Comanda comanda) {

    }

    @Override
    public Comanda get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor vizitor) {
        vizitor.visitPaste(this, this.cost);


    }

    @Override
    public String toString() {
        return "Paste: " +
                "name = " + Name +
                ", cost = " + cost;
    }
    public int getCost() {
        return cost;
    }
}

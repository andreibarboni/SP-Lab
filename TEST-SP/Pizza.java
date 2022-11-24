

public class Pizza implements Comanda, Visitee {
    private final String Name;
    private  int cost;

    public Pizza(String name, int cost) {
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
        vizitor.visitPizza(this, this.cost);
    }



    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "name = " + Name +
                ", cost = " + cost;
    }
}

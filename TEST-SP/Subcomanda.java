import java.util.ArrayList;
import java.util.List;

public class Subcomanda implements Comanda{
    private final List<Comanda> subcomenzi = new ArrayList<>();
    private final String numeComanda;
    private int cost;

    public Subcomanda(String numeComanda) {
        this.numeComanda = numeComanda;
    }

    @Override
    public void print() {
        System.out.println(this.numeComanda);
        for (Comanda comanda : this.subcomenzi){
            comanda.print();

        }

    }

    @Override
    public void add(Comanda comanda) {
        this.subcomenzi.add(comanda);
    }

    @Override
    public void remove(Comanda comanda) {
        this.subcomenzi.remove(comanda);
    }

    @Override
    public Comanda get(int i) {
        return this.subcomenzi.get(i);
    }

    @Override
    public void accept(Visitor vizitor) {

        for (Comanda comanda : subcomenzi){
            comanda.accept(vizitor);
        }
        vizitor.visitSubcomanda(this,this.cost);
    }

    @Override
    public String toString() {
        return "Subcomanda: " +
                "name = " + numeComanda;
    }
}

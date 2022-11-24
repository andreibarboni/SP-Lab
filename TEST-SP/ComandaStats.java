public class ComandaStats implements Visitor{
    int costTotal = 0;
    int costPizza = 0;
    int costPaste = 0;
    int costSalata = 0;

    @Override
    public void visitSubcomanda(Subcomanda subcomanda, int cost) {
        System.out.println("Am vizitat " + subcomanda.toString());
        costTotal+=cost;
    }

    @Override
    public void visitPizza(Pizza pizza, int cost) {
        System.out.println("Am vizitat " + pizza.toString());
        costPizza += pizza.getCost();

    }

    @Override
    public void visitPaste(Paste paste, int cost) {
        System.out.println("Am vizitat " + paste.toString());
        costPaste+= paste.getCost();


    }

    @Override
    public void visitSalata(Salata salata, int cost) {
        System.out.println("Am vizitat " + salata.toString());
        costSalata+= salata.getCost();


    }



    public void getStats() {
        System.out.println("Total : " + costTotal);
        System.out.println("Pizza : " + costPizza);
        System.out.println("Salate : " + costSalata);
        System.out.println("Paste : " + costPaste);

    }
}

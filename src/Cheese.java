public class Cheese extends Pizza implements Topping {
    Pizza pizza;
    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Cheese";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+80;
    }
}

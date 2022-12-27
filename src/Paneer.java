public class Paneer extends Pizza implements Topping{
    Pizza pizza;
    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Paneer";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+60;
    }
}

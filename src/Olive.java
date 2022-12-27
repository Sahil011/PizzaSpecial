public class Olive extends Pizza implements Topping{
    Pizza pizza;
    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Olive";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+20;
    }
}

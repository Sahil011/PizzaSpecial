public class Tomato extends Pizza implements Topping{
    Pizza pizza;
    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" + Tomato";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+30;
    }
}

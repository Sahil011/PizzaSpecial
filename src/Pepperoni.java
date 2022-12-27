public class Pepperoni  extends Pizza{

    public String getDescription(){
        return "Pepperoni";
    }

    @Override
    public int getCost() {
        return 180;
    }
}

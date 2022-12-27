public class Farmhouse extends Pizza{

    public String getDescription(){
        return "Farmhouse";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
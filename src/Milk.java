public class Milk extends Decorator {
    public Milk(Coffee coffee) {
        super(coffee);
        description = "Milk";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Milk ";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
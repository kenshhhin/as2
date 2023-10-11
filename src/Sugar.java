public class Sugar extends Decorator {
    public Sugar(Coffee coffee) {
        super(coffee);
        description = "Sugar";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Sugar ";
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
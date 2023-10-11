public class Choco extends Decorator {
    public Choco (Coffee coffee) {
        super(coffee);
        description = "Chocolade";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Cocolade ";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
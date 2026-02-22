package design.pattern.visitor;

public class Food extends VisitableProduct {
    protected double price;

    public Food(double price) {
        super();
        this.price = price;
    }

}

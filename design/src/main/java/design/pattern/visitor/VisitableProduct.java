package design.pattern.visitor;

public abstract class VisitableProduct {
    private String name;
    private double price;

    public VisitableProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract Number getPriceWithTaxes(TaxVisitorProtocol taxVisitor);
}

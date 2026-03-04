package design.pattern.visitor;

public class AlcoholicDrink extends VisitableProduct {
    protected double price;

    public AlcoholicDrink(double price) {
        super("Alcoholic Drink", price);
        this.price = price;
    }

	@Override
	public Number getPriceWithTaxes(TaxVisitorProtocol taxVisitor) {
        return taxVisitor.calculateTaxesForAlcoholicDrink(this);
	}

}

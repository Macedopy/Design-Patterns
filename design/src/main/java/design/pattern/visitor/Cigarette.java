package design.pattern.visitor;

public class Cigarette extends VisitableProduct {
    protected double price;

    public Cigarette(double price) {
        super("Cigarette", price);
        this.price = price;
    }

	@Override
	public Number getPriceWithTaxes(TaxVisitorProtocol taxVisitor) {
		return taxVisitor.calculateTaxesForCigarette(this);
	}

}

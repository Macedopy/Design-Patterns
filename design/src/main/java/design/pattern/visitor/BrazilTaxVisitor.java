package design.pattern.visitor;

public class BrazilTaxVisitor implements TaxVisitorProtocol {

	@Override
	public Number calculateTaxesForFood(Food food) {
		return food.getPrice() + food.getPrice() * 0.1;
	}

	@Override
	public Number calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
		return alcoholicDrink.getPrice() + alcoholicDrink.getPrice() * 0.5;
	}

	@Override
	public Number calculateTaxesForCigarette(Cigarette cigarette) {
		return cigarette.getPrice() + cigarette.getPrice() * 0.8;
	}
    
}

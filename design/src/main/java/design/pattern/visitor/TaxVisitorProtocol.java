package design.pattern.visitor;

public interface TaxVisitorProtocol {
    Number calculateTaxesForFood(Food food);
    Number calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink);
    Number calculateTaxesForCigarette(Cigarette cigarette);
}

package design.pattern.visitor;

public interface TaxVisitorProtocol {
    void calculateTaxesForFood(Food food);
    void calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink);
    void calculateTaxesForCigarette(Cigarette cigarette);
}

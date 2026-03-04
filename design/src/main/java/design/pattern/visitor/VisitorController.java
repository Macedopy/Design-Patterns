package design.pattern.visitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

    @GetMapping
    public boolean calculateTax() {
        BrazilTaxVisitor taxVisitor = new BrazilTaxVisitor();

        VisitableProduct food = new Food(10);
        VisitableProduct alcoholicDrink = new AlcoholicDrink(20);
        VisitableProduct cigarette = new Cigarette(30);

        //accept
        food.getPriceWithTaxes(taxVisitor);
        alcoholicDrink.getPriceWithTaxes(taxVisitor);
        cigarette.getPriceWithTaxes(taxVisitor);

        return true;
    }
}

package design.pattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinanceController {
    @Autowired
    private BinanceAPI binanceAPI;

    @GetMapping("/price")
    public Double getPrice() {
        Bitcoin bitcoin = new Bitcoin(0.0);

        double newPrice = binanceAPI.getLastPrice();

        bitcoin.setPrice(newPrice);

        return binanceAPI.getLastPrice();
    }
}
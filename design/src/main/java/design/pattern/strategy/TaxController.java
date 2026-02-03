package design.pattern.strategy;

import java.io.InputStream;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import design.pattern.strategy.services.ICMS;
import design.pattern.strategy.services.ISS;

@RestController
public class TaxController {

    @PutMapping
    public Response calculateTax(Object request) {
        String taxType = "ISS";

        String amount = "500";

        if(taxType.contains("ICMS")) {
            new ICMS();
        };
        
        if(taxType.contains("ISS")){
            new ISS().calculateTax(0);
        };
        if(taxType.contains("IPI")) {
            //calcular IPI
        };

        return taxType;

    }
}

package design.pattern.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterController {
    @Autowired
    SalesReportGenerator salesReportGenerator;
    @Autowired
    CreatorPdfAdapter creatorPdfAdapter;
    @Autowired
    PdfAdapter pdfAdapter; 



    @PostMapping
    public void generateReport() {
        CreatorPdfAdapter creatorPdfAdapter = new CreatorPdfAdapter();
        SalesReportGenerator salesReportGenerator = new SalesReportGenerator(pdfAdapter, creatorPdfAdapter);
        salesReportGenerator.generate();
    }
}

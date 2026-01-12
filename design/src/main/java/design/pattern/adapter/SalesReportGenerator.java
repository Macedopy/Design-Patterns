package design.pattern.adapter;

import java.sql.Date;

public class SalesReportGenerator {
    private final PdfAdapter pdfAdapter;
    private final CreatorPdfAdapter creatorPdfAdapter;

    public SalesReportGenerator(PdfAdapter pdfAdapter, CreatorPdfAdapter creatorPdfAdapter) {
        this.pdfAdapter = pdfAdapter;
        this.creatorPdfAdapter = creatorPdfAdapter;
    }

    public void generate() {
        String fileName = new Date(System.currentTimeMillis()).toString() + "_sales_report.pdf";



        pdfAdapter.generate(fileName, content);
    }
}

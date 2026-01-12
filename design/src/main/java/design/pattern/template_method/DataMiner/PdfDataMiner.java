package design.pattern.template_method.DataMiner;

import java.util.List;

public class PdfDataMiner {
    public void mine(String path)
    {
        String fileContent = this.openFile(path);
        List<String> rawData = this.extractPdfData(fileContent);
        List<String> parsedData = this.parsePdfData(rawData);
        List<String> analyzedData = this.analyseData(parsedData);
        this.sendReport(analyzedData);
    }

    private String openFile(String path)
    {
        return "Content of the doc file";
    }

    private List<String> extractPdfData(String fileContent)
    {
        return List.of("raw_data_pdf");
    }

    private List<String> parsePdfData(List<String> rawData)
    {
        return List.of("parsed_data_pdf");
    }

    private List<String> analyseData(List<String> parsedData)
    {
        return List.of("analyzed_data_pdf");
    }

    private void sendReport(List<String > analyzedData)
    {
        System.out.println("Report sent for pdf data: " + analyzedData);
    }
}

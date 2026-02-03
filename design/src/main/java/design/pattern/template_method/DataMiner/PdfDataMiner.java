package design.pattern.template_method.DataMiner;

import java.util.List;

public class PdfDataMiner extends DataMiner {

    protected String openFile(String path)
    {
        return "Content of the pdf file";
    }

    protected List<String> extractData(String fileContent)
    {
        return List.of("raw_data_pdf");
    }

    protected List<String> parseData(List<String> rawData)
    {
        return List.of("parsed_data_pdf");
    }
}

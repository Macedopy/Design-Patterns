package design.pattern.template_method.DataMiner;

import java.util.List;

public abstract class DataMiner {
    public void mine(String path)
    {
        String fileContent = this.openFile(path);
        List<String> rawData = this.extractData(fileContent);
        List<String> parsedData = this.parseData(rawData);
        List<String> analyzedData = this.analyseData(parsedData);
        this.sendReport(analyzedData);
    }

    protected abstract String openFile(String path);

    protected abstract List<String> extractData(String fileContent);

    protected abstract List<String> parseData(List<String> rawData);

    private List<String> analyseData(List<String> parsedData)
    {
        return List.of("analyzed_data_doc");
    }

    private void sendReport(List<String > analyzedData)
    {
        System.out.println("Report sent for doc data: " + analyzedData);
    }
}

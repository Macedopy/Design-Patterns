package design.pattern.memento;

public class ImageEditor {
    private String filePath;
    private String fileFormat;

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertFormatTo(String format)
    {
        this.fileFormat = format;
        this.filePath = this.filePath.split("\\.")[0] + "." + format;
        this.filePath += '.' + format;
    }
}

package design.pattern.memento;

import java.util.Date;

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

    public final Memento save()
    {
        return new ConcreteMemento(
            fileFormat,
            new Date(),
            filePath,
            fileFormat
        );
    }

    public final void restore(Memento memento) 
    {
        ConcreteMemento concreteMemento = (ConcreteMemento) memento;
        this.filePath = concreteMemento.getFilePath();
        this.fileFormat = concreteMemento.getFileFormat();
    }
}

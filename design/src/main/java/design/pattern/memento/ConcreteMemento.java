package design.pattern.memento;

import java.util.Date;

public class ConcreteMemento implements Memento {
    private String name;
    private Date date;
    private String filePath;
    private String fileFormat;

    public ConcreteMemento(
        String name, 
        Date date, String 
        filePath, String 
        fileFormat
    ) 
    {
        this.name = name;
        this.date = date;
        this.fileFormat = fileFormat;
        this.filePath = filePath;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public Date getDate() 
    {
        return date;
    }

    public String getFilePath() 
    {
        return filePath;
    }

    public String getFileFormat() 
    {
        return fileFormat;
    }
}
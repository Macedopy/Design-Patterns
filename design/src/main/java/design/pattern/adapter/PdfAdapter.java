package design.pattern.adapter;

public interface PdfAdapter {
    public void generate(String fileName, String content) throws Exception;
}

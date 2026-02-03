package design.pattern.adapter;

public class CreatorPdfAdapter implements PdfAdapter {

    @Override
    public void generate(String fileName, String content) {
        String creatorContent = "Created with CreatorPDF\n" + content;

        
    }

}

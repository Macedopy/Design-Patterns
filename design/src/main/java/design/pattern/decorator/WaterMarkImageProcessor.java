package design.pattern.decorator;

public class WaterMarkImageProcessor implements ImageProcessorInterface {
    private ImageProcessorInterface imageProcessor;
    private String watermarkText;
    public WaterMarkImageProcessor (ImageProcessorInterface imageProcessor, String watermarkText) {
        this.imageProcessor = imageProcessor;
        this.watermarkText = watermarkText;
    }

    @Override
    public String process(String imagePath) 
    {
        imagePath = imagePath + watermarkText;
        this.imageProcessor.process(imagePath);

        return imagePath;
    }

}

package design.pattern.decorator;

public class ResizeImageProcessor implements ImageProcessorInterface {
    private ImageProcessorInterface imageProcessor;
    private Integer height;
    private Integer width;

    public ResizeImageProcessor(ImageProcessorInterface imageProcessor, Integer height, Integer width) {
        this.imageProcessor = imageProcessor;
        this.height = height;
        this.width = width;
    }

    @Override
    public String process(String imagePath) {
        imagePath = imagePath + "_resized_" + height + "x" + width;
        this.imageProcessor.process(imagePath);

        return imagePath;
    }

    

}

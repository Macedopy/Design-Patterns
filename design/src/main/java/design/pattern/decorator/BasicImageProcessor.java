package design.pattern.decorator;

public class BasicImageProcessor implements ImageProcessorInterface {
    private static FileHandler fileHandler;
    @Override
    public String process(String imagePath) {

        String newImagePath = "uploads/file.jpg";

        fileHandler.writeFile(newImagePath, "Basic Image Content");

        return newImagePath;
    }

}

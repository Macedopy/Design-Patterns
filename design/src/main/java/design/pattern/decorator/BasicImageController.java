package design.pattern.decorator;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicImageController {
    @PutMapping("/process-image")
    public String processImage(String imagePath) {
        BasicImageProcessor processor = new BasicImageProcessor();

        new WaterMarkImageProcessor(processor, "Bruno Watermarked");

        new ResizeImageProcessor(processor, 800, 600);

        return processor.process(imagePath);
    }
}

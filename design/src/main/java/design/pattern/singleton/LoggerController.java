package design.pattern.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
    @Autowired
    private Logger logger;

    @PostMapping("/log")
    public void createLog() 
    {
        logger.log("app.log", "This is a log message.");
    }
}

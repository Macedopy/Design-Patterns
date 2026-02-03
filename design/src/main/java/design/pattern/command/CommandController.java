package design.pattern.command;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
    @PostMapping("/execute")
    public boolean executeCommand() {
        //Receiver
        SmartHouseLight bedRoomLight = new SmartHouseLight("Bed Room", false, 50);

        //Command
        LightHousePowerCommand lightHousePowerCommand = new LightHousePowerCommand(bedRoomLight);

        //Invoker
        SmartHouseApp smartHouseApp = new SmartHouseApp();
        smartHouseApp.addCommand("home-button", lightHousePowerCommand);
        return true;
    }

}

package design.pattern.command;

public class LightHousePowerCommand implements SmartHouseCommand {
    private final SmartHouseLight light;

    public LightHousePowerCommand(SmartHouseLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}

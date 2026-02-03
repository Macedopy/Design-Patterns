package design.pattern.command;

public class SmartHouseLight {
    private boolean isOn = false;
    private int intensity = 50;
    public String name;

    public SmartHouseLight(String name, boolean isOn, int intensity) {
        this.isOn = isOn;
        this.intensity = intensity;
        this.name = name;
    }

    public String getPowerStatus()
    {
        return isOn ? "ON" : "OFF";
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean on()
    {
        this.isOn = true;
        return this.isOn;
    }

    public boolean off()
    {
        this.isOn = false;
        return this.isOn;
    }

    public int increaseIntensity(int value)
    {
        if(this.intensity >= 100) return this.intensity;
        this.intensity += 1;
        return this.intensity;
    }

    public int decreaseIntensity(int value)
    {
        if(this.intensity <= 0) return this.intensity;
        this.intensity -= 1;
        return this.intensity;
    }
}

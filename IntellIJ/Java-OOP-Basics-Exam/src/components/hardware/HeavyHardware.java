package components.hardware;

public class HeavyHardware extends HardwareComponent{
    public HeavyHardware(String name, Integer maxCapacity, Integer maxMemory) {
        super(name, maxCapacity, maxMemory);
    }

    @Override
    public void setMaxCapacity(Integer maxCapacity) {
        super.setMaxCapacity(maxCapacity * 2);
    }

    @Override
    public void setMaxMemory(Integer maxMemory) {
        super.setMaxMemory(maxMemory - (maxMemory / 4));
    }

    @Override
    public String getType() {
        return "Heavy";
    }
}

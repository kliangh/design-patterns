package code.kliangh.structural.adapter;

public class PowerAdapter {
    private SocketType supportedPlugType;

    private Integer maxSupportedVoltage;

    private Integer minSupportedVoltage;

    public PowerAdapter() {
        this.supportedPlugType = SocketType.JIS_C;
        this.maxSupportedVoltage = 240;
        this.minSupportedVoltage = 100;
    }

    public void installSupportedPlug(SocketType socketType) {
        SocketType.valueOf(socketType.name());
        this.supportedPlugType = socketType;
    }

    public boolean startCharging(Integer inputVoltage) {
        if (checkSocketVoltage(inputVoltage)) {
            return true;
        }

        return false;
    }

    private boolean checkSocketVoltage(Integer inputVoltage) {
        boolean isCompatible = false;

        if (minSupportedVoltage <= inputVoltage
                && inputVoltage <= maxSupportedVoltage) {
            isCompatible = true;
        }

        return isCompatible;
    }
}

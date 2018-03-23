package code.kliangh.structural.adapter;

public class MacBook {
    private Boolean isCharging;

    public MacBook() {
        this.isCharging = false;
    }

    public void chargeMacBook(Socket socket, PowerAdapter powerAdapter) {
        powerAdapter.installSupportedPlug(socket.getSocketType());
        this.isCharging =
                powerAdapter.startCharging(socket.getVoltage());
    }

    public void stopChargingMacBook() {
        this.isCharging = false;
    }

    public Boolean getChargingStatus() {
        return isCharging;
    }
}

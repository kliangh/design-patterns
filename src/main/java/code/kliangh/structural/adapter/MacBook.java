package code.kliangh.structural.adapter;

public class MacBook {
    private Boolean isCharging;

    private PowerAdapter powerAdapter;

    public MacBook() {
        this.isCharging = false;
        this.powerAdapter = new PowerAdapter();
    }

    public void chargeMacBook(Socket socket) {
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

package code.kliangh.structural.adapter;

public class CreepySocket implements Socket {
    private Integer voltage;

    private SocketType socketType;

    public CreepySocket() {
        this.voltage = 90;
        this.socketType = SocketType.JIS_C;
    }

    @Override
    public int getVoltage() {
        return this.voltage;
    }

    @Override
    public SocketType getSocketType() {
        return this.socketType;
    }
}

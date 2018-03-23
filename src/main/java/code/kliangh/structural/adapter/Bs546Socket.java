package code.kliangh.structural.adapter;

public class Bs546Socket implements Socket {
    private SocketType socketType;

    private Integer voltage;

    public Bs546Socket() {
        this.socketType = SocketType.BS_546;
        this.voltage = 250;
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

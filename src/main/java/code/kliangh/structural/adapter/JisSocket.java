package code.kliangh.structural.adapter;

public class JisSocket implements Socket {
    private SocketType socketType;

    private Integer voltage;

    public JisSocket() {
        this.socketType = SocketType.JIS_C;
        this.voltage = 100;
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

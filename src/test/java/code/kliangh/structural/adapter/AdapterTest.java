package code.kliangh.structural.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdapterTest {
    private MacBook macBook;

    private Socket jisSocket;

    private Socket bs546Socket;

    private Socket creepySocket;

    @Before
    public void setUp() {
        this.macBook = new MacBook();
        this.jisSocket = new JisSocket();
        this.bs546Socket = new Bs546Socket();
        this.creepySocket = new CreepySocket();
    }

    @Test
    public void checkMacBookStatus() {
        assertFalse(macBook.getChargingStatus());
    }

    @Test
    public void chargeMacBook() {
        macBook.chargeMacBook(jisSocket);
        assertTrue(macBook.getChargingStatus());

        macBook.stopChargingMacBook();
        assertFalse(macBook.getChargingStatus());
    }

    @Test
    public void chargeMacBookWithUnsupportedVoltage() {
        macBook.chargeMacBook(bs546Socket);
        assertFalse(macBook.getChargingStatus());

        macBook.chargeMacBook(creepySocket);
        assertFalse(macBook.getChargingStatus());
    }
}
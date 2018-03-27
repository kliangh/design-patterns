package code.kliangh.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class GsxR1000RTest {

    @Test
    public void cloneGsxR1000R() throws CloneNotSupportedException {
        GsxR1000R r1000R = new GsxR1000R();
        r1000R = r1000R.clone();

        //Validate spec.
        assertEquals(Engine.FOUR_CYLINDER, r1000R.getEngine());
        assertEquals(FrontFork.SHOWA_BFF, r1000R.getFrontFork());
        assertEquals(Paint.ECSTAR, r1000R.getPaint());
        assertTrue(r1000R.hasQuickShiftSystem());
        assertTrue(r1000R.getDisplacement() == 999);
        assertTrue(r1000R.getTransmission() == 6);
    }
}
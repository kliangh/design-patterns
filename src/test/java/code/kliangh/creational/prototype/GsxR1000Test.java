package code.kliangh.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GsxR1000Test {

    @Test
    public void createGsxR1000() throws CloneNotSupportedException {
        GsxR1000 r1000 = new GsxR1000();
        r1000 = r1000.clone();

        //Validate spec.
        assertEquals(Engine.FOUR_CYLINDER, r1000.getEngine());
        assertEquals(FrontFork.SHOWA_BPF, r1000.getFrontFork());
        assertEquals(Paint.GLOSS, r1000.getPaint());
        assertFalse(r1000.hasQuickShiftSystem());
        assertTrue(r1000.getDisplacement() == 999);
        assertTrue(r1000.getTransmission() == 6);
    }
}
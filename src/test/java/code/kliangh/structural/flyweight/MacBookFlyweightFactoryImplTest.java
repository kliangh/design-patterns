package code.kliangh.structural.flyweight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MacBookFlyweightFactoryImplTest {
    private MacBookFlyweightFactory macBookFlyweightFactory;

    private MacBook macBook;

    private static final String MAC_BOOK_AIR_SPEC = "MacBook Air 1.8 GHz 8GB 125GB";

    private static final String MAC_BOOK_PRO_13_SPEC = "MacBook Pro 13\" 2.8 GHz 16GB 256GB Radeon Pro 550 13\"";

    private static final String MAC_BOOK_PRO_15_SPEC = "MacBook Pro 15\" 2.9 GHz 16GB 512GB Radeon Pro 560 15\"";

    @Before
    public void setUp() {
        macBookFlyweightFactory = new MacBookFlyweightFactoryImpl();
    }

    @Test
    public void getMacBook() {
        macBook = macBookFlyweightFactory.getMacBook(MacBookModel.MACBOOK_AIR);
        assertTrue(macBook instanceof MacBookAir);
        assertEquals(999, macBook.getMacBookPrice());
        assertEquals(MAC_BOOK_AIR_SPEC, macBook.showMacBookSpec());

        macBook = macBookFlyweightFactory.getMacBook(MacBookModel.MACBOOK_PRO_13);
        assertTrue(macBook instanceof MacBookPro);
        assertEquals(2399, macBook.getMacBookPrice());
        assertEquals(MAC_BOOK_PRO_13_SPEC, macBook.showMacBookSpec());

        macBook = macBookFlyweightFactory.getMacBook(MacBookModel.MACBOOK_PRO_15);
        assertTrue(macBook instanceof MacBookPro);
        assertEquals(2799, macBook.getMacBookPrice());
        assertEquals(MAC_BOOK_PRO_15_SPEC, macBook.showMacBookSpec());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnavailableModel() {
        macBookFlyweightFactory.getMacBook(MacBookModel.MACBOOK);
    }
}
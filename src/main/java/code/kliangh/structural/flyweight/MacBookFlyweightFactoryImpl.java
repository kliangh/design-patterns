package code.kliangh.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MacBookFlyweightFactoryImpl implements MacBookFlyweightFactory {
    private Map<MacBookModel, MacBook> macBooks = new HashMap<>();

    @Override
    public synchronized MacBook getMacBook(MacBookModel macBookModel) {
        macBooks.computeIfAbsent(macBookModel, macBook -> getNewMacBook(macBookModel));

        return macBooks.get(macBookModel);
    }

    private MacBook getNewMacBook(MacBookModel macBookModel) {
        if (MacBookModel.MACBOOK_AIR.equals(macBookModel)) {
            return new MacBookAir();
        } else if (MacBookModel.MACBOOK_PRO_13.equals(macBookModel)) {
            return new MacBookPro(false);
        } else if (MacBookModel.MACBOOK_PRO_15.equals(macBookModel)) {
            return new MacBookPro(true);
        } else {
            throw new UnsupportedOperationException("Given MacBook model is not available.");
        }
    }
}

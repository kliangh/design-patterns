package code.kliangh.structural.flyweight;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

public class MacBookAir implements MacBook {
    private MacBookModel macBookModel;

    private Integer price;

    private String cpu;

    private String ram;

    private String ssd;

    public MacBookAir() {
        this.macBookModel = MacBookModel.MACBOOK_AIR;
        this.price = 999;
        this.cpu = "1.8 GHz";
        this.ram = "8GB";
        this.ssd = "125GB";
    }

    @Override
    public int getMacBookPrice() {
        return this.price;
    }

    @Override
    public String showMacBookSpec() {
        return StringUtils.join(
                ImmutableList.of(
                        macBookModel.getModelName(),
                        cpu,
                        ram,
                        ssd
                ), " "
        );
    }
}

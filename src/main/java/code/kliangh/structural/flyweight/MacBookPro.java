package code.kliangh.structural.flyweight;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

public class MacBookPro implements MacBook {
    private MacBookModel macBookModel;

    private Integer price;

    private String cpu;

    private String ram;

    private String ssd;

    private String gpu;

    private String size;

    public MacBookPro(boolean isFifteenInches) {
        this.ram = "16GB";

        if (isFifteenInches) {
            this.price = 2799;
            this.cpu = "2.9 GHz";
            this.ssd = "512GB";
            this.gpu = "Radeon Pro 560";
            this.size = "15\"";
            this.macBookModel = MacBookModel.MACBOOK_PRO_15;
        } else {
            this.price = 2399;
            this.cpu = "2.8 GHz";
            this.ssd = "256GB";
            this.gpu = "Radeon Pro 550";
            this.size = "13\"";
            this.macBookModel = MacBookModel.MACBOOK_PRO_13;
        }
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
                        ssd,
                        gpu,
                        size
                ), " "
        );
    }
}

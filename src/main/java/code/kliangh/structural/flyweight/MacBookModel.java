package code.kliangh.structural.flyweight;

public enum MacBookModel {
    MACBOOK("MacBook"),
    MACBOOK_AIR("MacBook Air"),
    MACBOOK_PRO_13("MacBook Pro 13\""),
    MACBOOK_PRO_15("MacBook Pro 15\"");

    private final String modelName;

    MacBookModel(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }
}

package code.kliangh.structural.flyweight;

public enum MacbookModel {
    MACBOOK("Macbook"),
    MACBOOK_AIR("Macbook Air"),
    MACBOOK_PRO("Macbook Pro");

    private final String modelName;

    MacbookModel(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }
}

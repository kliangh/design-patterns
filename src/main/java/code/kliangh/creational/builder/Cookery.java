package code.kliangh.creational.builder;

public enum Cookery {
    STEW("Stewed"),
    ROAST("Roasted");

    private final String prefix;

    Cookery(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}

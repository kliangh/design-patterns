package code.kliangh.creational.builder;

public class ProcessedIngredients {
    private Cookery cookery;

    private String processedIngredientsName;

    public Cookery getCookery() {
        return cookery;
    }

    public void setCookery(Cookery cookery) {
        this.cookery = cookery;
    }

    public String getProcessedIngredientsName() {
        return processedIngredientsName;
    }

    public void setProcessedIngredientsName(String processedIngredientsName) {
        this.processedIngredientsName = processedIngredientsName;
    }
}

package code.kliangh.structural.composite;

public interface Document {
    void addComponent(Document document);

    void removeComponent(Document document);

    Document getChild(Document document);

    int countTotalDocument(Document document);
}

package code.kliangh.structural.composite;

public abstract class Publication implements Document {

    abstract void addComponent(Document document);

    abstract void removeComponent(Document document);

    abstract Document getChapter(Document document);
}

package code.kliangh.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manual extends Publication {
    private String manualName;

    private int level;

    private boolean isTerminalNode = false;

    private List<Document> chapters;

    @Override
    public void addComponent(Document document) {
        chapters.add(document);
    }

    @Override
    public void removeComponent(Document document) {
        chapters.remove(document);
    }

    @Override
    public Document getChapter(Document document) {
        return chapters.stream()
                .filter(chapter -> chapter.equals(document))
                .findAny()
                .orElse(null);
    }

    @Override
    public int countPages() {
        return chapters.stream().mapToInt(Document::countPages).sum();
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public boolean isTerminalNode() {
        return this.isTerminalNode;
    }

    public Manual(String manualName,
                  int level,
                  Document... chapters) {
        this.manualName = manualName;
        this.level = level;
        this.chapters = new ArrayList(Arrays.asList(chapters));
    }
}

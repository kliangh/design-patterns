package code.kliangh.structural.composite;

public class Chapter implements Document {
    private String chapterName;

    private int level;

    private boolean isTerminalNode = true;

    private int pages;

    public Chapter(String chapterName,
                   int level,
                   int pages) {
        this.level = level;
        this.chapterName = chapterName;
        this. pages = pages;
    }

    public String getChapterName() {
        return chapterName;
    }

    @Override
    public int countPages() {
        return pages;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public boolean isTerminalNode() {
        return this.isTerminalNode;
    }
}

package code.kliangh.structural.composite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChapterTest {
    private Chapter testChapter;

    private String chapterName = "index";

    private int level = 2;

    private int pages = 10;

    @Before
    public void setUp() {
        testChapter = new Chapter(chapterName, level, pages);
    }

    @Test
    public void getChapterName() {
        Assert.assertTrue(chapterName.equals(testChapter.getChapterName()));
    }

    @Test
    public void countPages() {
        Assert.assertEquals(pages, testChapter.countPages());
    }

    @Test
    public void getLevel() {
        Assert.assertEquals(level, testChapter.getLevel());
    }

    @Test
    public void isTerminalNode() {
        Assert.assertTrue(testChapter.isTerminalNode());
    }
}
package code.kliangh.structural.composite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class ManualTest {
    private Chapter firstChapter;
    private String firstChapterName = "Index";
    private int firstChapterLevel = 2;
    private int firstChapterPages = 5;

    private Chapter secondChapter;
    private String secondChapterName = "Instructions";
    private int secondChapterLevel = 2;
    private int secondChapterPages = 57;

    private Chapter thirdChapter;
    private String thirdChapterName = "Appendix";
    private int thirdChapterLevel = 2;
    private int thirdChapterPages = 15;

    private Manual testManual;
    private String manualName = "Test Manual";
    private int manualLevel = 1;

    @Before
    public void setUp() {
        firstChapter = new Chapter(firstChapterName, firstChapterLevel, firstChapterPages);
        secondChapter = new Chapter(secondChapterName, secondChapterLevel, secondChapterPages);
        thirdChapter = new Chapter(thirdChapterName, thirdChapterLevel, thirdChapterPages);

        testManual = new Manual(
                manualName,
                manualLevel,
                firstChapter,
                secondChapter);
    }

    @Test
    public void addComponent() {
        testManual.addComponent(thirdChapter);
        assertEquals(thirdChapter, testManual.getChapter(thirdChapter));
    }

    @Test
    public void removeComponent() {
        testManual.removeComponent(secondChapter);
        assertNull(testManual.getChapter(secondChapter));
    }

    @Test
    public void countPages() {
        assertEquals(firstChapterPages + secondChapterPages,
                testManual.countPages());
    }

    @Test
    public void getChapter() {
        assertEquals(firstChapter, testManual.getChapter(firstChapter));
    }

    @Test
    public void getLevel() {
        assertEquals(manualLevel, testManual.getLevel());
    }

    @Test
    public void isTerminalNode() {
        assertFalse(testManual.isTerminalNode());
    }
}
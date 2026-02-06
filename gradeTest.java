import org.junit.Assert;
import org.junit.Test;

public class gradeTest {

    grade g;

    @Test
    public void testForF() {
        g = new grade();
        Assert.assertEquals("F", g.gra(30));
    }

    @Test
    public void testForD() {
        g = new grade();
        Assert.assertEquals("D", g.gra(45));
    }

    @Test
    public void testForC() {
        g = new grade();
        Assert.assertEquals("C", g.gra(60));
    }

    @Test
    public void testForB() {
        g = new grade();
        Assert.assertEquals("B", g.gra(70));
    }

    @Test
    public void testForA() {
        g = new grade();
        Assert.assertEquals("A", g.gra(85));
    }

    @Test
    public void testForO() {
        g = new grade();
        Assert.assertEquals("O", g.gra(95));
    }

    @Test
    public void testForZero() {
        g = new grade();
        Assert.assertEquals("F", g.gra(0));
    }

    @Test
    public void testForNegative() {
        g = new grade();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            g.gra(-10);
        });
    }
}

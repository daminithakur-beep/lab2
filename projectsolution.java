import org.junit.*;
public class projectsolution
{
    @Test
    public void test()
    {
        project p = new project();
        Assert.assertEquals(30,p.add(10, 20));
        Assert.assertEquals(50,p.add(20, 30));
        Assert.assertNotEquals(40,p.add(10, 20));

    }
}
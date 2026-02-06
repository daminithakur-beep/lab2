public class grade
{
    public String gra(int per)
    {
        String g;

        if(per<0)

            {
                throw new IllegalArgumentException("per can not be negative");
            }
            else if(per<40)
            {
                g="F";
            }
            else if(per <50)
            {
                g= "D";
            }
            else if(per <65)
            {
                g="C";
            }
            else if(per<75)
            {
                g="B";
            }
            else if(per<90)
            {
                g="A";
            }
            else 
            {
                g="O";
            }
            System.out.println(g);
        return g;

    }
}
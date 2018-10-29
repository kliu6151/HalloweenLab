
public class Runner {
    public static void main(String[] args)
    {
        String[][] mySpookyLantern = new String[8][8];
        JackOLantern jackOLantern = new JackOLantern(mySpookyLantern);
        jackOLantern.fill("*");
        jackOLantern.edit("D", 2, 1);
        jackOLantern.edit("D", 2, 6);
        jackOLantern.edit("0", 5, 1);
        for(int i = 0;i<4;i++)
        {
            jackOLantern.edit("0", 6, 2 + i );
        }
        jackOLantern.edit("0", 5, 6);
        System.out.print(jackOLantern.toString());

    }
}

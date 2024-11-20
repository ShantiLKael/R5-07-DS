public class Q4
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Pour éxecuter ce programme : java Etoile <nbEtoiles>");
            return;
        }
        
        int nbEtoiles = Integer.parseInt(args[0]);
        String sRet = "";
        for (int i = 1; i <= nbEtoiles; i++)
        {
            sRet += "*".repeat(i);
            sRet += "\n";
        }
        
        System.out.println(sRet);
    }
}

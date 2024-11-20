public class Q5
{
    public static void main(String[] args) // Bonne correction à vous
    {
        if (args.length == 0)
        {
            System.out.println("Pour éxecuter ce programme : java Etoile <nbEtoiles>");
            return;
        }
        
        int nbEtoiles = Integer.parseInt(args[0]);
        String sRet = "";
        for (int i = nbEtoiles; i > 0; i--)
        {
            sRet += "X".repeat(i);
            sRet += "\n";
        }
        
        System.out.println(sRet);
    }
}

public class Q3
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    {
      System.out.println("Pour éxecuter ce programme : \njava Etoile <nbEtoiles>");
      return;
    }
    
    int nbEtoiles = Integer.parseInt(args[0]);
    String sRet = "";
    
    for (int i = 0; i < nbEtoiles; i++)
      sRet += "*";
    
    System.out.println(sRet);
  }
}

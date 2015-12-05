public class Equal3
{
  public static void main(String[] args)
  {
    int tala1 = Integer.parseInt(args[0]);
    int tala2 = Integer.parseInt(args[1]);
    int tala3 = Integer.parseInt(args[2]);

    if (tala1 == tala2 && tala2 == tala3)
    {
      System.out.println("Allt eins");
    }
    else
    {
      System.out.println("Ekki eins");
    }
  }
}

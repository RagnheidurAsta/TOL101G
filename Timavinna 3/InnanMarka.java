public class InnanMarka
{
  public static void main(String[] args)
  {
    int x = Integer.parseInt(args[0]);

    if (x >= 0 && x <= 10)
    {
      System.out.println("Innan marka.");
    }
    else
    {
      System.out.println("Utan marka.");
    }
  }
}

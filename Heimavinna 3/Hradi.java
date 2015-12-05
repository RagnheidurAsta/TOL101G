public class Hradi
{
  public static void main(String[] args)
  {
    double tyngd = Double.parseDouble(args[0]);
    double margfeldi = Math.ceil(tyngd - 1.0);
    double verd = (2500 + (margfeldi * 500));

    if (tyngd > 0 && tyngd <= 25)
    {
      System.out.println("Kostnadurinn er " + verd + " kr.");
    }
    else if (tyngd <= 0)
    {
      System.out.println("Villa, pakki hefur enga thyngd.");
    }
    else if (tyngd > 25)
    {
      System.out.println("Villa, pakkinn er of thungur.");
    }
  }
}

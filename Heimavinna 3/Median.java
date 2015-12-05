public class Median
{
  public static void main (String[] args)
  {
    double gildi1 = Double.parseDouble (args[0]);
    double gildi2 = Double.parseDouble (args[1]);
    double gildi3 = Double.parseDouble (args[2]);

    if ((gildi1 < gildi2 && gildi1 > gildi3) || (gildi1 < gildi3 && gildi1 > gildi2))
    {
      System.out.println(gildi1);
    }
    else if ((gildi2 < gildi1 && gildi2 > gildi3) || (gildi2 < gildi3 && gildi2 > gildi1))
    {
      System.out.println(gildi2);
    }
    else if ((gildi3 < gildi1 && gildi3 > gildi2) || (gildi3 < gildi2 && gildi3 > gildi1))
    {
      System.out.println(gildi3);
    }
    else if (gildi1 == gildi2 || gildi1 == gildi3)
    {
      System.out.println("Sla tharf inn 3 mismunandi gildi.");
    }
  }
}

public class HourGlass
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);

    for (int i=0; i<(2 * n) - 1; i++)
    {
      for (int j=0; j < ((2*n-1)/2) - Math.abs((2*n-1)/2 - i); j++)
        System.out.print(" ");
      for (int j=0; j < (2*n-1 - (2*((2*n-1)/2 - Math.abs((2*n-1)/2 - i)))); j++)
        System.out.print("*");
      System.out.println("");
    }
  }
}

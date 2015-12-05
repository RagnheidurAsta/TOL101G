public class Fall2
{
  public static double geomean(double[] a)
  {
    int i = 0;
    double b = 1;
    while(i < a.length-1)
    {
      b *= a[i];
      i++;
    }
    double c = Math.pow(b, (1.0/i));
    return c;
  }
  public static void main(String[] args)
  {
    double[] a = {
    1.0, 2.0, 3.0, 4.0, 5.0, 6.0
    };
    StdOut.println("Geomean: " + geomean(a));
  }
}

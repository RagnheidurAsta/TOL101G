public class Fall1
{
  public static double[] hlutSlembifylki(int n)
  {
    double[] a = new double[2*n];
    double j = 0.0;
    for(int i = 0; i < a.length; i++)
    {
      if(i%2 == 0)
      {
        a[i] = j;
        j++;
      }
      else
      {
        a[i] = Math.random();
      }
    }
    return a;
  }
  public static void main(String[] args)
  {
    double[] b = hlutSlembifylki(5);
    for(int i = 0; i < b.length; i++)
    {
      StdOut.println(b[i]);
    }
  }
}

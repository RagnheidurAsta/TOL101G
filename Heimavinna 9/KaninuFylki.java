public class KaninuFylki
{
  public static long fjolgun(int n)
  {
    long[] a = new long[n+1];
    a[0] = 0;
    a[1] = 1;
    for (int i = 2; i <=n; i++)
    {
      if (i <= 4)
      {
        a[i] = a[i-1] + a[i-2];
      }
      else
      a[i] = a[i-1] + a[i-2] - a[i-4];
    }
    return a[n];
  }
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    StdOut.println(fjolgun(n));
  }
}

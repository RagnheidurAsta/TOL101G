public class Fall5
{
  public static int[] tidnirit(int[] a, int M)
  {
    int[] t = new int[M];
    for(int i = 0; i < a.length; i++)
    {
      t[a[i]] += 1;
    }
    return t;
  }
  public static void synatidni(int[] t)
  {
    for(int i = 0; i < t.length; i++)
    {
      StdOut.print(i + ": ");
      for(int j = 0; j < t[i]; j++)
      {
        StdOut.print("*");
      }
      StdOut.println("");
    }
  }
  public static void main(String[] args)
  {
    int M = 20;
    int[] a = new int[100];
    for(int i = 0; i < a.length; i++)
    {
      a[i] = (int) (Math.random() * M);
    }
    int[] t = tidnirit(a, M);
    synatidni(t);
  }
}

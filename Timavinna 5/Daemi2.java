public class Daemi2
{
  public static int finna(int[] a, int x)
  {
    int v = -1;
    for (int i = 0; i < a.length; i++)
    {
      if (x == a[i])
        v = i;
    }
    return v;
  }
  public static void main(String[] args)
  {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
    {
      a[i] = ((int) (Math.random() * 11));
    }
    StdOut.println("2 er i saeti " + finna(a, 2));
    StdOut.println("-5 er i saeti " + finna(a, -5));
  }
}

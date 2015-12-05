public class EndurPalin
{
  public static boolean prec(int[] a, int i, int j)
  {
    if (i <= j)
    {
      if (a[i] != a[j])
        return false;
      else
        return true;
    }
    return prec(a, i++, j--);
  }
  public static void main(String[] args)
  {
    int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    int[] b = {1, 3, 4, 5, 2, 1};

    StdOut.println(prec(a, 0, a.length - 1));
    StdOut.println(prec(b, 0, b.length - 1));
  }
}

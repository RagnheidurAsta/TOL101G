public class Palindrome
{
  public static boolean palin(int[] a)
  {
    int N = a.length;
    for (int i = 0; i < Math.ceil(N / 2); i++, N--)
    {
      if (a[i] != a[N - 1])
        return false;
    }
    return true;
  }
  public static void main(String[] args)
  {
    int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    int[] b = {1, 3, 4, 5, 2, 1};

    StdOut.println(palin(a));
    StdOut.println(palin(b));
  }
}

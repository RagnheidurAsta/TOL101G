public class Nr1
{
  public static int aha(int a, int b)
  {
    if (a < b) return 0;
    return 1 + aha(a - b, b);
  }
  public static void main(String[] args)
  {
    StdOut.println(aha(5, 2));
  }
}

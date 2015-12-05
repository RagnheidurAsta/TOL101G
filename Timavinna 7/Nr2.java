public class Nr2
{
  public static void printnum(int n)
  {
    if (n == 1)
      StdOut.println(n);
    else
    {
      StdOut.println(n);
      printnum(n-1);
    }
  }
  public static void main(String[] args)
  {
  printnum(9);
  }
}

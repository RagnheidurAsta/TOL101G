public class Fall2
{
  public static String endurtaka(String s, int n)
  {
    String v = s;
    for(int i = 1; i < n; i++)
    {
      s += v;
    }
    return s;
  }
  public static void main(String[] args)
  {
    String s = args[0];
    int n = Integer.parseInt(args[1]);
    String e = endurtaka(s, n);
    StdOut.println(e);
  }
}

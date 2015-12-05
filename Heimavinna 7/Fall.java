public class Fall
{
  public static boolean erPythagorisk(int a, int b, int c)
  {
    boolean i = ((a*a)+(b*b) == (c*c));
    return i;
  }
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    boolean svar = erPythagorisk(a, b, c);
    StdOut.println(svar);
  }
}

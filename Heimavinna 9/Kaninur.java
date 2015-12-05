public class Kaninur
{
  public static int fjolgun(int n)
  {
    if (n <= 0) return 0;
    if (n == 1) return 1;
    return (fjolgun(n-1) + fjolgun(n-2) - fjolgun(n-4));
  }
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    StdOut.println(fjolgun(n));
  }
}

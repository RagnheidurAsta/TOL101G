public class Endurkvaemni
{
  public static int veldi(int x, int n)
  {
    if (n == 0)
      return 1;
    else
      return x * veldi(x, n - 1);
  }
  public static void main(String[] args)
  {
    int x = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    StdOut.println(veldi(x, n));
  }
}

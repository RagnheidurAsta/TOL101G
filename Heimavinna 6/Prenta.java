public class Prenta
{
  public static void main(String[] args)
  {
    double x = 12345.6789;

    StdOut.println("\n");
    StdOut.printf("%5.2f", x);
    StdOut.println("\n");
    StdOut.printf(" %5.3f", x);
    StdOut.println("\n");
    StdOut.printf("%5.4f", x);
    StdOut.println("\n");
    StdOut.printf("%5.6f", x);
    StdOut.println("\n_");
  }
}

public class FilterOut
{
  public static void main(String[] args)
  {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    while (!StdIn.isEmpty())
    {
      double x = StdIn.readDouble();
      if (a > x || x > b)
      {
        StdOut.println("Leyfilegt x: " + x);
      }
      else
        StdOut.println("Ekki leyfileg tala");
    }
  }
}

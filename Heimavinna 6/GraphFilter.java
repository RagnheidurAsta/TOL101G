public class GraphFilter
{
  public static void main(String[] args)
  {
    //Read in bounding box and rescale
    double x0 = StdIn.readDouble();
    double y0 = StdIn.readDouble();
    double x1 = StdIn.readDouble();
    double y1 = StdIn.readDouble();
    StdDraw.setXscale(x0, x1);
    StdDraw.setYscale(y0, y1);

    double t = 0;
    double t1 = 0;

    //Stilla pennann
    StdDraw.setPenRadius(0.01);

    //Plot lines
    while (!StdIn.isEmpty())
    {
      double a = StdIn.readDouble();
      double b = StdIn.readDouble();

      if (t > 0)
      {
      StdDraw.line(t, t1, a, b);
      }

      double a1 = StdIn.readDouble();
      double b1 = StdIn.readDouble();

      StdDraw.line(a, b, a1, b1);
      t = a1;
      t1 = b1;
    }
    //Syna linurnar
    StdDraw.show(0);
  }
}

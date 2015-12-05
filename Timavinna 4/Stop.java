public class Stop
{
  public static void main(String[] args)
  {
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);

    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.filledCircle(0.0, 0.0, 0.5);

    StdDraw.setPenColor(StdDraw.YELLOW);
    double[] x = {-0.4, 0.4, 0.4, -0.4};
    double[] y = {0.06, 0.06, -0.06, -0.06};
    StdDraw.filledPolygon(x, y);
  }
}

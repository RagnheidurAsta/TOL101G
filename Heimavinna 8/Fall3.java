public class Fall3
{
  public static int slembi739(int r)
  {
    return (171 * r + 7) % 739;
  }
  public static void main(String[] args)
  {
    int r = 0;
    double x = 0.0;
    double y = 0.0;
    StdDraw.setPenRadius(0.01);
    for(int i = 0; i < 1000; i++)
    {
      r = slembi739(r);
      double rx = (double) (r);
      x = (rx/739.0);
      r = slembi739(r);
      double ry = (double) (r);
      y = (ry/739.0);
      StdDraw.point(x, y);
    }
  }
}

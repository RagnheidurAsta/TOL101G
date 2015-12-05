public class Sierpinski
{
  public static void drawTri(double[] x, double[] y)
  {
    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
    StdDraw.filledPolygon(x, y);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.polygon(x,y);
  }

  public static void createTri(double[] x, double[] y, int maxDepth, int depth)
  {
    //reikna midpunkta
    double mx0 = (x[0] + x[1])/2;
    double my0 = (y[0] + y[1])/2;
    double mx1 = (x[1] + x[2])/2;
    double my1 = (y[1] + y[2])/2;
    double mx2 = (x[2] + x[0])/2;
    double my2 = (y[2] + y[0])/2;

    //bua til nyja trihyrninga
    double[] newTrix0 = {x[0], mx0, mx2};
    double[] newTriy0 = {y[0], my0, my2};
    double[] newTrix1 = {mx0, x[1], mx1};
    double[] newTriy1 = {my0, y[1], my1};
    double[] newTrix2 = {mx2, mx1, x[2]};
    double[] newTriy2 = {my2, my1, y[2]};

    if (maxDepth == depth)
    {
      drawTri(newTrix0, newTriy0);
      drawTri(newTrix1, newTriy1);
      drawTri(newTrix2, newTriy2);
    }
    else
    {
      createTri(newTrix0, newTriy0, maxDepth, depth+1);
      createTri(newTrix1, newTriy1, maxDepth, depth+1);
      createTri(newTrix2, newTriy2, maxDepth, depth+1);
    }
  }

  public static void main(String[] args)
  {
    int maxDepth = Integer.parseInt(args[0]);
    double[] x = {0.0, 0.5, 1.0};
    double[] y = {0.0, 0.866, 0.0};
    createTri(x, y, maxDepth, 0);
  }
}

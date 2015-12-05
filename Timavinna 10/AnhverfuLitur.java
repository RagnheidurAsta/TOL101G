import java.awt.Color;

public class AnhverfuLitur
{
  public static Color andhverfa(Color c)
  {
    int r = c.getRed();
    int g = c.getGreen();
    int b = c.getBlue();
    Color andh = new Color(255 - r, 255 - g, 255 - b);
    return andh;
  }

  public static void main(String[] args)
  {
    Color blue = new Color(9, 90, 166);
    Color and2 = andhverfa(blue);
    StdDraw.setPenColor(and2);
    StdDraw.filledSquare(.5, .5, .5);
  }
}

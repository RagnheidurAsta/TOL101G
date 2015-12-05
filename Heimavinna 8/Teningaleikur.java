public class Teningaleikur
{
  public static int Kast()
  {
    int Teningur1 = StdRandom.uniform(1, 7);
    int Teningur2 = StdRandom.uniform(1, 7);
    return Teningur1 + Teningur2;
  }
  public static boolean Leikur1()
  {
    int k = Kast();
    if (k == 7 || k == 11)
    {
      return true;
    }
    else if (k == 2 || k == 3 || k == 12)
    {
      return false;
    }
    else
    {
      return Leikur2();
    }
  }
  public static boolean Leikur2()
  {
    int k2 = Kast();
    if (k2 == 4 || k2 == 5 || k2 == 6 || k2 == 8 || k2 == 9 || k2 == 10)
    {
      return true;
    }
    else if (k2 == 7)
    {
      return false;
    }
    else
      return Leikur2();
  }
  public static void main(String[] args)
  {
    int T = Integer.parseInt(args[0]);
    int h = 0;
    for (int i = 0; i < T; i++)
    {
      boolean utkoma = Leikur1();
      if (utkoma == true)
      {
        h++;
      }
    }
    double hlutfall = ((double) h/T) * 100;
    StdOut.println("Vinningshlutfallid er: " + hlutfall + "%");
  }
}

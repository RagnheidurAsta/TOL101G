public class Slembid
{
  public static int slembi(int r)
  {
    int tala = ((4 * r + 1) % 9);
    return tala;
  }
  public static void main(String[] args)
  {
    int r = 0;
    for(int i = 0; i < 10; i++)
    {
      r = slembi(r);
      StdOut.println(r);
    }
  }
}

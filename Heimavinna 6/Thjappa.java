public class Thjappa
{
  public static void main(String[] args)
  {
    int i = 0;
    int t = 0;

    while (!StdIn.isEmpty())
    {
      i = StdIn.readInt();
      if (i != t)
      {
        StdOut.print(i + " ");
      }
      t = i;
    }
  }
}

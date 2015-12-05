public class Unique
{
  public static void main(String[] args)
  {
    int[] a = new int[args.length];
    int v = 0;

    for (int i = 0; i < args.length; i++)
    {
      a[i] = Integer.parseInt(args[i]);
    }
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < i; j++)
      {
        if (i != j && a[i] == a[j])
        {
          System.out.println("Tvo eintok af " + a[i]);
          v++;
        }
      }
    }
    if (v == 0)
      System.out.println("Allar mismunandi.");
  }
}

public class Fall3
{
  public static int veljaEitt(int[] a)
  {
    int i = (int) (Math.random() * a.length);
    return i;
  }
  public static void main(String[] args)
  {
    int[] a = new int[100];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (int) (Math.random() * 100);
    }
    StdOut.println(veljaEitt(a));
  }
}

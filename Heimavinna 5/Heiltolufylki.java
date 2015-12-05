public class Heiltolufylki
{
  public static void main(String[] args)
  {
    int N = 100;
    int[] a;
    a = new int[N];
    int i;
    for (i = 0; i < N; i++)
    {
      a[i] = (int) (Math.random() * 1000);
    }
    int[] b = new int[N/2];
    for (i = 0; i < N; i += 2)
    {
      b[i/2] = a[i] + a[i+1];
      System.out.println(a[i] + " + " + a[i+1] + " = " + b[i/2]);
    }
  }
}

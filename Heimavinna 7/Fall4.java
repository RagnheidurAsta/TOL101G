public class Fall4
{
  public static double max(double[] a)
  {
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < a.length; i++)
      if (a[i] > max)
      {
        max = a[i];
      }
      return max;
  }
  public static double min(double[] a)
  {
    double min = Double.POSITIVE_INFINITY;
    for (int i = 0; i < a.length; i++)
      if (a[i] < min)
      {
        min = a[i];
      }
    return min;
  }
  public static double[] scale(double[] a)
  {
    double mismunur = max(a) - min(a);
    double min = min(a);
    for (int i = 0; i < a.length; i++)
    {
      a[i] = ((a[i] - min) / mismunur);
    }
    return a;
  }
  public static void main(String[] args)
  {
    double[] a = new double[10];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (Math.random() * 10);
    }
    scale(a);
    for (int i = 0; i < a.length; i++)
    {
      StdOut.println(a[i]);
    }
  }
}

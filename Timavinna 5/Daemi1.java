public class Daemi1
{
  public static String stjornur(int n)
  {
    String s = "";
    for (int i = 0; i < n; i++)
    {
      s += "*";
    }
    return s;
  }
  public static void main(String[] args)
  {
    String s = stjornur(4);
    System.out.println(s);
  }
}

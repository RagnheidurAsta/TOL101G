public class Strengur
{
  public static void main(String[] args)
  {
    String s = "Island er lydveldi med tingbundinni stjorn";
    String t = s.substring(0, s.indexOf("er")) + "var " + s.substring(s.indexOf("lydveldi"), s.length());
    StdOut.println(t);

    int fjoldi = 0;
    char n = s.charAt(5);
    for(int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) == n)
        fjoldi++;
    }
    StdOut.println(fjoldi);
  }
}

public class SlembiDagur
{
  public static void main(String[] args)
  {
    double dagur = (Math.random() * 5);

    if (dagur >= 0 && dagur < 1)
    {
      System.out.println("Manudagur");
    }
    if (dagur >= 1 && dagur < 2)
    {
      System.out.println("Thridjudagur");
    }
    if (dagur >= 2 && dagur < 3)
    {
      System.out.println("Midvikudagur");
    }
    if (dagur >= 3 && dagur < 4)
    {
      System.out.println("Fimmtudagur");
    }
    if (dagur >= 4 && dagur < 5)
    {
      System.out.println("Fostudagur");
    }
  }
}

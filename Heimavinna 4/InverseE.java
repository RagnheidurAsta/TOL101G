public class InverseE
{
  public static void main(String[] args)
  {
    double n;
    double lausn;
    double deilte = 1/Math.E;
    //for (n=1, lausn=0; ((deilte - lausn)>0.0001) || ((lausn - deilte)>0.0001); n++)
    for (n=1, lausn=0; Math.abs(deilte - lausn)>0.0001; n++)
    {
      lausn = Math.pow((1-(1/n)), n);
    }
    System.out.println("Nalgada gildid er "+ lausn);
    System.out.println("Retta gildid er " + deilte);
    System.out.println("Gildi n er " + (n-1));
  }
}

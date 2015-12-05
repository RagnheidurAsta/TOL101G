public class GamblerPlot
{
  public static void main(String[] args)
  {
    int stake = Integer.parseInt(args[0]);
    int goal = Integer.parseInt(args[1]);
    int bets = 0;
    int cash = stake;

    while (cash > 0 && cash < goal)
    {
      bets++;
      if (Math.random() < 0.5)
        cash++;
      else
        cash--;
      for (int i = 1; i <= cash; i++)
        System.out.print("*");
      System.out.println("");
    }
  }
}

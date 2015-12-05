public class Decked
{
  public static void main(String[] args)
  {
    // avoid hardwired constants
    int N = Integer.parseInt(args[0]);
    int M = Integer.parseInt(args[1]);
    int[] deck = new int[N];
    int[][] fylki = new int[N][N];

    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        fylki[i][j] = 0;
      }
    }

    for (int j = 0; j < M; j++)
    {
      //Set inn í fylkið þannig að a[i] = i
      for (int i = 0; i < N; i++)
      {
        deck[i] = i;
      }
      // shuffle
      for (int i = 0; i < N; i++)
      {
          int r = (int) (Math.random() * (N));
          int t = deck[r];
          deck[r] = deck[i];
          deck[i] = t;
      }
      for (int i = 0; i < N; i++)
      {
          fylki[deck[i]][i] += 1;
      }
    }
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        System.out.print(fylki[i][j] + " ");
      }
      System.out.println("");
    }
  }
}

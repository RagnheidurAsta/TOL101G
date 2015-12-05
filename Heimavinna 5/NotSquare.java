public class NotSquare
{
  public static void main(String[] args)
  {
    int[][] a = {
      {1, 2, 3, 4, 5},
      {1, 2, 3, 4, 5},
      {1, 2, 3, 4, 5}
    };
    int[][] b = {
      {1, 2, 3},
      {1, 2, 3},
      {1, 2, 3},
      {1, 2, 3},
      {1, 2, 3},
    };

    if (a[0].length == b.length)
    {
      int[][] c = new int[a.length][b[0].length];
      for (int i = 0; i < a.length; i++)
      {
        for (int j = 0; j < b[0].length; j++)
        {
          for (int l = 0; l < c[0].length; l++)
          {
            c[i][j] += a[i][l] * b[l][j];
          }
        }
      }
      for(int i = 0; i < a.length; i++)
      {
        for (int j = 0; j < b[0].length; j++)
        {
          System.out.print(c[i][j] + " ");
        }
        System.out.println("");
      }
    }
    else
    {
      System.out.println("Ekki er haegt ad margfalda thessi fylki saman.");
    }
  }
}

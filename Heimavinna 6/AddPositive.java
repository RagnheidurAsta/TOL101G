public class AddPositive
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
          int x = StdIn.readInt();
          if (x >= 0)
          {
          sum = sum + x;
          }
          else
          {
          StdOut.println("Sladu inn jakvaeda tolu: ");
          i--;
          }
        }
        StdOut.println("Sum is " + sum);
    }
}

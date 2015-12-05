public class EvenDiv {
  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);

      if (n%m == 0) {
        System.out.println("True");
}
      else if (m%n == 0) {
        System.out.println("True");
}
      else {
        System.out.println("False");
    }
  }
}

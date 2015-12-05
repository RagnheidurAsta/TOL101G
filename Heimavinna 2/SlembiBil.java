public class SlembiBil {
  public static void main(String[] args) {

    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    double range = (b - a);
    double gildi = (Math.random() * range + a);

    System.out.println(gildi);

  }
}

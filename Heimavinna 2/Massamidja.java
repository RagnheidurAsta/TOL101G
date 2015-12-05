public class Massamidja {
  public static void main(String[] args) {

    double massi1 = Double.parseDouble(args[0]);
    double massi2 = Double.parseDouble(args[1]);
    double dist = Double.parseDouble(args[2]);

    double fjarmassa = (dist * (massi2 / (massi1 + massi2)));

    System.out.println(fjarmassa);
  }
}

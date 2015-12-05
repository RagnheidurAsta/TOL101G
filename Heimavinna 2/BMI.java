public class BMI {
  public static void main(String[] args) {

    double tyngd = Double.parseDouble(args[0]);
    double haed = Double.parseDouble(args[1]);

    double jafna1 = (haed*haed);
    double jafna2 = (tyngd/jafna1);

    System.out.println("BMI: " + jafna2);

  }
}

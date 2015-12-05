public class Pizza
{
  public static void main(String[] args)
  {
    double pizzainch = Double.parseDouble(args[0]);
    double pizzacm = (pizzainch * 2.54);
    double pizzaradius = (pizzacm / 2);
    double pizzaflatarmal = (Math.PI * (pizzaradius * pizzaradius));
    double pizzamettar = Math.floor(pizzaflatarmal / 500);

    System.out.println("Pizzan mettar " + pizzamettar + " nemendur.");

  }
}

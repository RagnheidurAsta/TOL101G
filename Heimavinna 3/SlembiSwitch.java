public class SlembiSwitch
{
  public static void main(String[] args)
  {
    double dagur = Math.random() * 5;
    int vikudagur = (int)Math.ceil(dagur);
    String einhverdagur = "Villa";
    switch (vikudagur)
    {
      case 1: einhverdagur = "Manudagur";
      break;
      case 2: einhverdagur = "Thridjudagur";
      break;
      case 3: einhverdagur = "Midvikudagur";
      break;
      case 4: einhverdagur = "Fimmtudagur";
      break;
      case 5: einhverdagur = "Fostudagur";
      break;
    }
      System.out.println(einhverdagur);
  }
}

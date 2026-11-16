import java.util.Scanner;

public class StepUp {
  public static void main(String[] a) {
    Scanner in = new Scanner(System.in);
    Tracker t = new Tracker();
    System.out.print("Steps today: ");
    t.add(in.nextInt());

    System.out.printf("%.1f km%n", t.km());
    System.out.printf("%.0f kcal%n", t.kcal());
    System.out.println(Coach.tip(t.steps));
  }
}

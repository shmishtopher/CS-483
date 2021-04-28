import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
  public static void main(String[] args) {
    Pattern a1 = Pattern.compile("1(0|1)*0");
    Pattern a2 = Pattern.compile("(0|1)*1(0|1)*1(0|1)*1(0|1)*");

    Matcher a1_accepted = a1.matcher("1000110010");
    Matcher a1_rejected = a1.matcher("1001000101");
    Matcher a2_accepted = a2.matcher("0111101011");
    Matcher a2_rejected = a2.matcher("1000000001");

    System.out.println("Pattern\t\t\t\tInput\t\tResult");
    System.out.println("1(0|1)*0\t\t\t1000110010\t" + a1_accepted.matches());
    System.out.println("1(0|1)*0\t\t\t1001000101\t" + a1_rejected.matches());
    System.out.println("(0|1)*1(0|1)*1(0|1)*1(0|1)*\t0111101011\t" + a2_accepted.matches());
    System.out.println("(0|1)*1(0|1)*1(0|1)*1(0|1)*\t1000000001\t" + a2_rejected.matches());
  }
}
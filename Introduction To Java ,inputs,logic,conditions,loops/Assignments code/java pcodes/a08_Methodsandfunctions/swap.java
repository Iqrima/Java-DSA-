
import java.util.Scanner;
public class swap {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = 20;
       int b = 10;

       int temp = a;
       a = b;
       b = temp;
       System.out.println(a + " " + b);
       sc.close();


    }
}

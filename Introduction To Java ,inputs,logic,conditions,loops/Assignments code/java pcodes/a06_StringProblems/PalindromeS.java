
import java.util.Scanner;
public class PalindromeS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a word");
        String s = sc.nextLine();

        String reverse = "";

        reverse = reverse + s.charAt(4);
        reverse = reverse + s.charAt(3);
        reverse = reverse + s.charAt(2);
        reverse = reverse + s.charAt(1);
        reverse = reverse + s.charAt(0);

        if (s.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");

        }


    }

}

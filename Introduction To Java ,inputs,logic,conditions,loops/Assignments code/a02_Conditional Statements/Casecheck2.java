
// this case check program will be for capital letters, small letters
// ,numbers also for any symbols @##$%!?><  they will print as symbols //

import java.util.Scanner;
public class Casecheck2 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("uppercase");
        } else if (ch >= '1' && ch <= '9') {
            System.out.println("number");
        } else {
            System.out.println("symbols");
        }

    }

}










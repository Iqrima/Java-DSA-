

import java.util.Scanner;
public class Marks {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter score");
        int marks = sc.nextInt();
        if ( marks < 50 ) {
            System.out.println("fail");
        } else {
            System.out.println("pass");
        }
    }
}






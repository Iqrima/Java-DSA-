
/*kk code version*/
import java.util.Scanner;
public class Fibo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);                             /* if sout(b) is added in while loop bracket output comes of entire series
                                           like n=6 and output comes 0 1 2 3 5 8 means 8 is fibo num of 6

                                            but if outside while loop bracket only the output 8 comes */





    }
}



/*
using for loop

import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;


        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }

}
*/

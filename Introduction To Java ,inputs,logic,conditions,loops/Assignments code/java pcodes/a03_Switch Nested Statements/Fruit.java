package a03_Switch;

import java.util.Scanner;
public class Fruit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();

        switch (fruit) {
            case  "Apple":
                System.out.println("Doctors fruit");
                break;
                case  "Orange":
                    System.out.println("Orange fruit");
                    break;
                    case  "Pineapple":
                        System.out.println("Pineapple fruit");
                        break;
                        default:
                            System.out.println("Invalid fruit");
        }
    }
}


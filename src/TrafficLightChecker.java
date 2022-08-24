import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traffic light code");
        int currentColor = sc.nextInt();

        if (currentColor == 1) {
            System.out.println("Your next light is green");
        }
        else if (currentColor == 2) {
            System.out.println("Your next light is yellow");
        }
        else if (currentColor == 3) {
            System.out.println("Your next light is red");
        }
        else {
            System.out.println("Invalid code");
        }
    }

}

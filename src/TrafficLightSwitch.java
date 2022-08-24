import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traffic light code");
        int currentColor = sc.nextInt();

        switch (currentColor) {
            case 1:
                System.out.println("Your next light is green");
                break;
            case 2:
                System.out.println("Your next light is yellow");
                break;
            case 3:
                System.out.println("Your next light is red");
                break;
            default:
                System.out.println("Invalid code");
        }


    }

}

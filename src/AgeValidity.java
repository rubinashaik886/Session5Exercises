
import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean drivingUnderAge = false;
        int ageInput = sc.nextInt();

        if (ageInput < 18) {
            drivingUnderAge = true;
            System.out.println("You are underage");
        }




        sc.close();



    }
}

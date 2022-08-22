import java.util.Scanner;
import java.lang.*;

public class StringEquality {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        String m = "Moe";
        boolean test = m.equals(name);

        if (test == true) {
            System.out.println("You are the king");
        }
        else {
            System.out.println("You are not the king");
        }


    }

}


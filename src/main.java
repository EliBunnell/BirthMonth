import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int birthMonth = 9;
        String trash = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth month (1-12): ");
        if (input.hasNextInt()) {

            if (birthMonth >= 1 && birthMonth <= 12) {

                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("invalid month number: " + birthMonth);
                System.out.println("exiting.....");
                System.exit(0);

            }
        }
         else
            {
                trash = input.nextLine();
                System.out.println("invalid month number: " + trash);
                System.out.println("exiting.....");
                System.exit(0);
            }



    }
}

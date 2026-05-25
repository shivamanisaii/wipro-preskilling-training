import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {

            String input = scn.next();

            int n = Integer.parseInt(input);

            if(99 % n == 0) {

                System.out.println(n + " is a factor of 99");
            }

            else {

                System.out.println(n + " is not a factor of 99");
            }
        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception " + e);
        }

        catch(NumberFormatException e) {

            System.out.println("Number Format Exception " + e);
        }
    }
}
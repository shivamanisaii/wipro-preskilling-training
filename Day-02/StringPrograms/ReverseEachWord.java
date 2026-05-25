import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split(" ");

        for(int i = 0; i < words.length; i++) {

            String word = words[i];
            String reversed = "";

            for(int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            System.out.print(reversed);

            if(i != words.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
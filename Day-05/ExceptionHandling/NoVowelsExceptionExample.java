import java.util.Scanner;

public class NoVowelsExceptionExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            String text = s.nextLine();

            System.out.println("Original string: " + text);

            checkVowels(text);

            System.out.println("String contains vowels");
        }

        catch(NoVowelsException e) {

            System.out.println("String does not contain any vowels");
        }
    }

    public static void checkVowels(String text) throws NoVowelsException {

        String str = text.toLowerCase();

        boolean hasVowel = false;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                hasVowel = true;

                break;
            }
        }

        if(!hasVowel) {

            throw new NoVowelsException();
        }
    }
}
import java.util.Scanner;

public class EqualCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] > max) {
                max = freq[i];
            }
        }

        int result = s.length() - max;

        System.out.println(result);

        sc.close();
    }
}
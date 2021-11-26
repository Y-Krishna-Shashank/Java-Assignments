import java.util.HashSet;
import java.util.Scanner;

//Space complexity : O(N)
//Time complexity  : O(N)

public class AlphabetInAString {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input string: ");
        String input_string = scanner.nextLine();
        HashSet<Character> inputCharacters= new HashSet<>();

        //we use hashset for converting given string into a set of characters
        for(int idx=0;idx<input_string.length();idx++)
        {
            inputCharacters.add(input_string.charAt(idx));
        }
        if (stringHasAlphabet(inputCharacters))
            System.out.println("The given string contains all the letters of English alphabet");

        else
            System.out.println("The given string does not contain all the letters of English alphabet");


    }

    static boolean stringHasAlphabet(HashSet<Character> inputCharacters) {
        String alphabetInCaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetInSmall="abcdefghijklmnopqrstuvwxyz";

        //we check whether all the letters of alphabet are present in the input characters' hashset
        for (int idx = 0; idx < 26; idx++) {
            if(inputCharacters.contains(alphabetInCaps.charAt(idx))||inputCharacters.contains(alphabetInSmall.charAt(idx)))
            {
                continue;
            }

                return false;
        }
        return true;
    }
}

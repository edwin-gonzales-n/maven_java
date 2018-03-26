import org.apache.commons.lang3.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput;

        System.out.println("Hello, please enter a string");
        userinput = input.nextLine();
        System.out.println("You entered: " + userinput);

        hasVowels(userinput);

        if ((StringUtils.isNumeric(userinput))) {
            System.out.printf("%s is numeric\n", userinput);
        } else {
            System.out.printf("%s is not numeric\n", userinput);
        }

        System.out.printf("Flipped case: %s\n", StringUtils.swapCase(userinput));
        System.out.printf("Capitalize first letter: %s\n", StringUtils.capitalize(userinput));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(userinput));

    }

    public static void hasVowels(String input){
        CharSet vChs = CharSet.getInstance("aeiou");
        String strTest = input;
        int iVowelCnt = 0;

        for (int i = 0; i < strTest.length(); i++) {
            if (vChs.contains(strTest.charAt(i))) {
                iVowelCnt++; //increment count on a vowel being found
            }
        }
        System.out.println("String >>" + strTest);
        System.out.println("Number of vowels in the string is " + iVowelCnt);
    }
}

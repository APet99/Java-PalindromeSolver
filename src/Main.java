import java.util.Scanner;
/**
 * EGR327- Software Construction
 * Homework 0
 * @author Alex Peterson.
 * created on: 09/09/2019
 *
 * */
public class Main {
    private static String word = "";
    private static String reversed = "";
    private static Scanner scanner = new Scanner (System.in);

    /**
     * Enter a word or phrase to determine if it is a palindrome: kayak
     * kayak is a palindrome.
     * */
    public static void main(String[] args) {
            promptUser();
            if (isPalindrome()) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
    }

    /**
     * Checks a word and determines if it is a palindrome.
     * @return returns true if the word checked is a palindrome.
     * */
    private static boolean isPalindrome(){
        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }

    /**
     * Prompts the user to input a word to check.
     * */
    private static void promptUser(){
        System.out.print("Enter a word or phrase to determine if it is a palindrome: ");
        word = scanner.nextLine().toLowerCase();
    }
}
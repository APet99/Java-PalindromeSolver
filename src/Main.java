/**
 * EGR327- Software Construction
 * Homework 0
 *
 * @author Alex Peterson
 * created on: 09/09/2019
 *
 * */
import java.util.Scanner;
public class Main {
    public static String word = "";
    public static String reversed = "";
    public static Scanner scanner = new Scanner (System.in);
    /**
     * Enter a word or phrase to determine if it is a palindrome: kayak
     * kayak is a palindrome.
     * */
    public static void main(String[] args) {
        promptUser();
        if(isPalindrome()){
            System.out.println(word + " is a palindrome.");
        }else{
            System.out.println(word + " is not a palindrome.");
        }
    }

    /**
     * Checks a word and determines if it is a palindrome.
     * @return returns true if the word checked is a palindrome.
     * */
    public static boolean isPalindrome(){
        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }

    /**
     * Prompts the user to input a word to check.
     * */
    public static void promptUser(){
        System.out.print("Enter a word or phrase to determine if it is a palindrome: ");
        word = scanner.nextLine();
    }
}
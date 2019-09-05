import java.util.Scanner;

/**
* EGR327- Software Construction
* Homework 0
*
* @author Alex Peterson
 * created on: 09/09/2019
 *
* */


public class Main {
    public static String word = "";
    public static Scanner scanner = new Scanner (System.in);
    /**
     * Enter a word or phrase to determine if it is a palindrome: kayak
     * kayak is a palindrome.
     * */
    public static void main(String[] args) {
        promptUser();
        if(word == ""){
            System.out.println("ERROR: No word entered. Please try again!");
        }else if(isPalindrome(word)){
            System.out.println(word + " is a palindrome.");
        }else{
            System.out.println(word + " is not a palindrome.");
        }
    }


    /**
     * Checks a word and determines if it is a palindrome.
     * @param word the word the user wants to check.
     * @return returns true if the word checked is a palindrome.
     * */
    public static boolean isPalindrome(String word){
        StringBuilder userWord = new StringBuilder(word);

        return (word == userWord.reverse().toString();
    }

    /**
     * Prompts the user to input a word to check.
     * */
    public static void promptUser(){
        System.out.print("Enter a word or phrase to determine if it is a palindrome: ");
        word = scanner.nextLine().toLowerCase();
    }
}

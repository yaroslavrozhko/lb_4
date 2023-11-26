package org.example;

public class Main {

    public static void main(String[] args) {
        String word = "level";
        if (Palindrome.isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
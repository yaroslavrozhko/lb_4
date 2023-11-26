package org.example;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        // Убираем пробелы и приводим все к нижнему регистру для корректного сравнения
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        // Сравниваем строку с её обратным порядком
        String reversed = new StringBuilder(cleanStr).reverse().toString();

        return cleanStr.equals(reversed);
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){
        number= Math.abs(number);
        char[] digits =String.valueOf(number).toCharArray();
        String reversed="";
        for (int i = digits.length-1; i>=0 ; i--) {
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }

    public

}

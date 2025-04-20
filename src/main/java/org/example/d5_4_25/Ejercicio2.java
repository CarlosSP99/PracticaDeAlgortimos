package org.example.d5_4_25;


//2. Check if a string is a palindrome: Write a Java function
// that takes a string as input and returns true
// if the string is a palindrome (reads the same forwards and backwards), and false otherwise.
public class Ejercicio2 {
    public static void main(String[] args) {
        String word="aba";

        String reversed= new StringBuilder(word).reverse().toString();

        reversed=reversed.toLowerCase();
        word=word.toLowerCase();

        if (word.equals(reversed)){
            System.out.println("Son iguales");
        } else{
            System.out.println("No lo son");
        }
    }

}

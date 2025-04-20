package org.example.d5_4_25;



// Reverse a string: Write a Java function that takes a string as
// input and return a new string with the characters reversed.
// For example, if the input is “hello”, the function should return “olleh”.
public class Ejercicio1 {
    public static void main(String[] args) {
        String word="Hola";
        System.out.println("La palabra inicial es "+ word);
        char[] wordInChar=word.toCharArray();

        StringBuilder wordReverse = new StringBuilder();
        System.out.println(wordInChar.length);

        for (int i = wordInChar.length - 1; i >= 0; i--) {
            wordReverse.append(wordInChar[i]);
        }

        System.out.println("la palabra es "+wordReverse);
//        String reversed = new StringBuilder(word).reverse().toString();

    }
}

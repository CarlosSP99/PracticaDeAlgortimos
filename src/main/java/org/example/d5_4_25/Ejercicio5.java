package org.example.d5_4_25;

import java.util.Arrays;

//5. Determine if two strings are anagrams: Write a Java function that takes two strings
// as input and returns true if the two strings are anagrams
// (contain the same letters in a different order), and false otherwise.
public class Ejercicio5 {
    public static void main(String[] args) {
        String word="perro";
        String anagrama="repor";
        char[] almacenWord=word.toLowerCase().toCharArray();
        char[] almacenAnagram=anagrama  .toLowerCase().toCharArray();

        Arrays.sort(almacenAnagram);
        Arrays.sort(almacenWord);

        Boolean con=false;

        if (word.length()==anagrama.length()){
          con= Arrays.equals(almacenWord, almacenAnagram);
        } else{
            System.out.println("No son anagramas");
        }

        if (con){
            System.out.println("Son anagramas");
        }
    }
}

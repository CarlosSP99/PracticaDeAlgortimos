package org.example.d5_4_25;


import java.util.Arrays;

//4. Merge two sorted arrays: Write a Java function that takes two sorted arrays
// as input and returns a new array that contains all the elements of both arrays,
// also sorted in ascending order.
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array1=new int[]{1,4,6,12,8};
        int[] array2=new int[]{41,41,62,12,2,87};
        int contador=0;
        int[] arrayMerged=new int[array1.length+ array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayMerged[i]= array1[i];
            contador=i;
            System.out.println("el contador es"+contador);
        }

        for (int i = 0; i < array2.length; i++) {
            contador++;
            System.out.println("el contador es"+contador);
            arrayMerged[contador]=array2[i];
        }

        for (int number: arrayMerged){
            System.out.println(number);
        }

        Arrays.sort(arrayMerged);
    }
}

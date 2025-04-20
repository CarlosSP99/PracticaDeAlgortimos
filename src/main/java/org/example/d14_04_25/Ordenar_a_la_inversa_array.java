package org.example.d14_04_25;

import java.util.Arrays;

public class Ordenar_a_la_inversa_array {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 2, 0, 1, 4, 3};
        int contador = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                nums1[contador] = nums1[i];
                contador++;
            }
        }

        for (int i = contador; i < nums1.length; i++) {
            nums1[i]=0;
        }
        System.out.println(Arrays.toString(nums1));

    }
}
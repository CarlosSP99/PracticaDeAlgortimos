package org.example.d14_04_25;

import java.util.HashSet;

//Dado un array de enteros donde todos los elementos
// aparecen dos veces excepto uno, encuentra y devuelve ese único número.
public class Interseccion_de_dos_arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        HashSet<Integer> lista = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    lista.add(nums1[i]);
                }
            }
        }
        System.out.println(lista);
    }
}

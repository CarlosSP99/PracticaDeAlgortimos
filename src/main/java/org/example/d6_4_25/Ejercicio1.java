package org.example.d6_4_25;

import java.util.HashSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1,2,-3,3};

        HashSet<Integer> set = new HashSet<>();
        int biggestNumber = -1;

        for (int num : numbers) {
            // Si el opuesto ya está en el set, es candidato
            if (set.contains(-num)) {
                biggestNumber = Math.max(biggestNumber, Math.abs(num));
            }
            set.add(num);
        }
        System.out.println( set);

        if (biggestNumber != -1) {
            System.out.println("El número que cumple las condiciones es " + biggestNumber);
        } else {
            System.out.println("No hay número");
        }
    }
}
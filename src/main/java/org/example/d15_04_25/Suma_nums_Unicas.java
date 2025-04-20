package org.example.d15_04_25;

import java.util.HashMap;
import java.util.HashSet;

public class Suma_nums_Unicas {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1,8,23};
        HashMap<Integer, Integer> frecuencias = new HashMap<>();

        // Contar ocurrencias de cada número
        for (int num : nums1) {
           if (frecuencias.containsKey(num)){
               int contador=frecuencias.get(num);
               frecuencias.put(num, contador+1);
           }else {
               frecuencias.put(num, 1);
           }
        }

        int suma = 0;   
        // Sumar solo los que aparecen exactamente una vez
        for (int num : frecuencias.keySet()) {
            if (frecuencias.get(num) == 1) {
                suma += num;
            }
        }

        System.out.println("Suma de números únicos: " + suma);
    }
}

package org.example.d19_04_25;

import java.util.ArrayList;
import java.util.Arrays;

public class Encontrar_Elementos_Que_Aparecen_Mas_de_una_Vez_en_un_Array {
    public static void main(String[] args) {

        int[] numeros= new int[]{1, 2, 3, 2, 3, 4, 5, 3};
        int[] numeros2=new int[numeros.length];
        ArrayList<Integer> almacen = new ArrayList<Integer>(); // Create an ArrayList object
        ArrayList<Integer> almacen2 = new ArrayList<Integer>(); // Create an ArrayList object

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j] && i!=j) {
                   almacen.add(numeros[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < almacen.size(); i++) {
            int value = almacen.get(i);
            System.out.println(value);
            if (!almacen2.contains(value)){
                almacen2.add(value);
            }
        }

        System.out.println(almacen2);
    }
}

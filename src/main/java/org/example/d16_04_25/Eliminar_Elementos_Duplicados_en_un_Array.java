package org.example.d16_04_25;

import java.util.ArrayList;

public class Eliminar_Elementos_Duplicados_en_un_Array {
    public static void main(String[] args) {
        int[] almacen= new int[]{1, 2, 2, 3, 4, 3, 5};
        ArrayList<Integer> numerosArrayList = new ArrayList<Integer>(); // Create an ArrayList object
        for (int i = 0; i < almacen.length; i++) {
            if (!numerosArrayList.contains(almacen[i])){
                numerosArrayList.add(almacen[i]);
            }
        }
        System.out.println(numerosArrayList);
    }
}

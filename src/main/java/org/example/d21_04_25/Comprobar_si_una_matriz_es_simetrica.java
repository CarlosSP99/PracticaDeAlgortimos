package org.example.d21_04_25;

import java.util.Arrays;

public class Comprobar_si_una_matriz_es_simetrica {
    public static void main(String[] args) {
        int[][] original = {
                {1, 0, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        int[][] rotada=new int[original.length][original.length];
        boolean condition=true;
        // Creo la matriz rotada
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                rotada[j][i] = original[i][j];
            }
        }

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
              if (!(original[i][j]==rotada[i][j])){
                  condition=false;
                  break;
              }
            }
        }

        if (condition){
            System.out.println("son simetricas");
        }else {
            System.out.println("no lo son");
        }

        System.out.println("rotada");
        for (int[] fila : rotada) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println("original");
        for (int[] fila : original) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
//0,0 1,0 y 2,0 matienen
//0,1->1,0
//1,0->0,1
//
//0,2->2,0
//2,0-0,2
//
//1,2->2,1
//2,1-1,2
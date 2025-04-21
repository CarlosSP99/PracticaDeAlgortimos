package org.example.d21_04_25;

import java.util.Arrays;

public class Rotar_Matriz_Cuadrada_90_Grados {
    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = original.length;
        int[][] rotada = new int[n][n];

        // Colocamos cada elemento en su nueva posición rotada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("-------------");
                rotada[j][n - 1 - i] = original[i][j];
                System.out.println("-------------");
            }
        }

        // Mostramos la matriz rotada
        for (int[] fila : rotada) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
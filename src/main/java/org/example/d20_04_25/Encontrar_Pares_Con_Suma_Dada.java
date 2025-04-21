package org.example.d20_04_25;

import java.util.Objects;

public class Encontrar_Pares_Con_Suma_Dada {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 3, 5, 7, 8, 9};
        String[] b=new String[]{"0","0","0","0","0","0","0"};
        int contador=0;
        int target=10;
        int suma=0;



        //for (int i = 0; i < numeros.length; i++) {
        //            for (int j = i + 1; j < numeros.length; j++) {
        //                if (numeros[i] + numeros[j] == objetivo) {
        //                    System.out.println(numeros[i] + " + " + numeros[j] + " = " + objetivo);
        //                }
        //            }
        //        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                 suma= a[i]+a[j];
                if (suma==target){
                    String variableToStore = checkIfTheCombinationExist(a[i], a[j], b);
                    b[contador]=variableToStore;
                    if (!b[contador].equals("0")){
                        System.out.println(b[contador]);
                    }
                    contador++;
                }
            }
        }
    }

    public static String checkIfTheCombinationExist(int value1, int value2, String[] arrayToCheck){
        for (int i = 0; i < arrayToCheck.length; i++) {
            String valueToMatch= "("+value1+", "+value2+")";
            String valueToMatchReversed= "("+value2+", "+value1+")";

            if (Objects.equals(arrayToCheck[i], valueToMatchReversed) || Objects.equals(arrayToCheck[i], valueToMatch)){
                arrayToCheck[i]="0";
                return "0";
            }
        }

        return "("+value1+", "+value2+")";
    }
}

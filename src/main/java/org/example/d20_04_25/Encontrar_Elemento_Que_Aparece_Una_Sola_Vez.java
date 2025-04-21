package org.example.d20_04_25;

public class Encontrar_Elemento_Que_Aparece_Una_Sola_Vez {
    public static void main(String[] args) {
        int[] a = new int[]{4, 3, 2, 4, 1, 3, 2};
        int singleValue;
        boolean condition=false;
        for (int i = 0; i < a.length; i++) {
             condition=false;
            for (int j = 0; j < a.length; j++) {
                if (a[i]==a[j] && i!=j){
                    condition=true;
                    break;
                }
            }
            if (!condition){
                System.out.println(a[i]);
                break;
            }
        }
        if (condition){
            System.out.println("no hay ningun valor sin repetir");
        }
    }
}

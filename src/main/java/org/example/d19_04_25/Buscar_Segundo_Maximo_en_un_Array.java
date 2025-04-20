package org.example.d19_04_25;

public class Buscar_Segundo_Maximo_en_un_Array {
    public static void main(String[] args) {
        int[] almacen= new int[]{1,1, 1, 1, 1, 1, 1};
        int valorMayor=almacen[0];
        int valorMayor2=almacen[1];
        boolean condition=false;

        // calculo del numero mayor
        for (int i = 0; i < almacen.length; i++) {
            if (valorMayor<almacen[i]){
                valorMayor=almacen[i];
            }
        }

        // calculo del segundo numero mayor
        for (int i = 0; i < almacen.length; i++) {
            if (valorMayor2<almacen[i] && almacen[i]<valorMayor){
                valorMayor2=almacen[i];
                condition=true;
            }
        }

        if (condition){
            System.out.println("Segundo valor repetido "+valorMayor2);
        } else {
            System.out.println("No hay segundo valor");
        }
    }
}

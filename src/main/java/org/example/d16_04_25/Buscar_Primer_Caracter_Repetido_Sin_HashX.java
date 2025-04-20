package org.example.d16_04_25;

import java.util.Objects;

public class Buscar_Primer_Caracter_Repetido_Sin_HashX {


    public static void main(String[] args) {
        String palabro="ppddffe";
        String[] palabroArray = palabro.split("");

        String letra="";

        for (int i = 0; i < palabroArray.length; i++) {
            boolean repetida=false;
            for (int j = 0; j < palabroArray.length; j++) {
                if (i!=j && Objects.equals(palabroArray[i], palabroArray[j])){
                    repetida=true;
                    break;
                }
            }
            letra=palabroArray[i];
            if (!letra.isEmpty() && !repetida){
                System.out.println(letra);
                break;
            }
        }
    }
}

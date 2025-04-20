package org.example.d17_04_25;

import java.util.Arrays;
import java.util.Objects;

public class Contar_Palabras_Unicas_en_un_String {
    public static void main(String[] args) {
        String palabras = "que hola mundo hola amigo que amigo estudia hola";
        String[] palabrosEnArray = palabras.split(" ");
        int contador=0;
        int palabrosRepetido=0;

        for (int i = 0; i < palabrosEnArray.length; i++) {
            for (int j = 0; j < palabrosEnArray.length; j++) {
                if(Objects.equals(palabrosEnArray[i], palabrosEnArray[j]) && i!=j){
                    contador++;
                }
            }
        }
        System.out.println("El numero de palabras no repetidas es "+(palabrosEnArray.length-contador));
    }
}

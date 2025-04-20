package org.example.d16_04_25;

//Enunciado
//Dado un String, devuelve el primer carácter que no se repite en todo el string.
//Si todos se repiten, devuelve un espacio ' '.
//input: "abracadabra"
//output: 'c'

import java.util.HashMap;
import java.util.Objects;

public class Primer_letra_no_repetida {
    public static void main(String[] args) {
        String palabra ="asasdadc";
        String[] palabraArray=palabra.split("");
        HashMap<String, Integer> mapa = new HashMap<>();

        for(String letra: palabraArray){
            if (mapa.containsKey(letra)){
                mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
                //if (mapa.containsKey(letra)) {
                //    mapa.put(letra, mapa.get(letra) + 1);
                //} else {
                //    mapa.put(letra, 1);
                //}
            }else{
                mapa.put(letra,1);
            }

        }
        for (String clave : mapa.keySet()) {
            Integer valor = mapa.get(clave);
            if (valor==1){
                System.out.println(clave);
                break;
            } else {
                System.out.println(" ");
            }
        }
        System.out.println(mapa);
    }
}

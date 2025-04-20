package org.example.d13_04_25;

import java.util.Arrays;

public class Contains_duplicate {
    public static void main(String[] args) {
        int[] almacen = new int[]{2, 7, 11, 15,1,23,4,21,2};
        int valor=0;
        boolean isRepetido=false;
        for (int i = 0; i < almacen.length; i++) {
            valor=almacen[i];
            int[] almacen2 = Arrays.copyOfRange(almacen, i+1, almacen.length);
            Arrays.sort(almacen2);
            System.out.println(Arrays.toString(almacen2));
            int smt=Arrays.binarySearch(almacen2, valor);
            System.out.println(smt);

            if (smt>=0){
                isRepetido=true;
            }
        }
        System.out.println(isRepetido);
    }
}

//
//public class ContainsDuplicate {
//    public static void main(String[] args) {
//        int[] almacen = new int[]{2, 7, 11, 15, 1, 23, 4, 21, 2};
//        HashSet<Integer> set = new HashSet<>();
//        boolean isRepetido = false;
//
//        for (int i = 0; i < almacen.length; i++) {
//            if (set.contains(almacen[i])) {
//                isRepetido = true;
//                break;  // Si encontramos un repetido, podemos salir del bucle
//            }
//            set.add(almacen[i]);  // Añadimos el número al conjunto
//        }
//
//        System.out.println(isRepetido);  // True si hay un duplicado, False si no
//    }
//}
package org.example.d13_04_25;


//Dado un array de enteros nums y un entero target,
// devuelve los índices de los dos números que suman target.
//Debes asumir que cada entrada tendrá exactamente una solución,
// y no puedes usar el mismo elemento dos veces.
public class Two_Sum {

    public static void main(String[] args) {
        int target=9;
        int result=0;
        int value1=0;
        int value2=0;

        int[] almacen = new int[]{2, 7, 11, 15};

        for (int i = 0; i < almacen.length; i++) {
            for (int j = i+1; j < almacen.length-i; j++) {
                result=almacen[i]+almacen[j];
                if (result==target){
                    value1=i;
                    value2=j;
                    break;
                }
            }
        }
        System.out.println(value1);
        System.out.println(value2);
    }
}

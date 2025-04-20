package org.example.d6_4_25;

import java.util.Arrays;


//Given two sorted arrays nums1 and nums2 of size m and n respectively,
// return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).
public class _4_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int contador=0;
        int[] array1=new int[]{1,2};
        int[] array2 = new int[]{3,4};
        int[] arrayMerged=new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayMerged[i]=array1[i];
            contador=i;
        }
        System.out.println(contador);

        System.out.println(contador);

        for (int i = 0; i < array2.length; i++) {
            contador+=1;
            arrayMerged[contador]=array2[i];
        }
        // [1,2,3,4]

        Arrays.sort(arrayMerged);
        double valorMedio=0.00;

        if (arrayMerged.length%2==0){
            double position1=arrayMerged[(arrayMerged.length+1)/2];
            double position2=arrayMerged[((arrayMerged.length-1)/2)];

            System.out.println(position2);
            System.out.println(position1);

            valorMedio=  (position1 + position2) /2;
            System.out.println(valorMedio);
        } else{
            valorMedio=arrayMerged[(arrayMerged.length-1)/2];
            System.out.println(valorMedio);
        }


    System.out.println(Arrays.toString(Arrays.stream(arrayMerged).toArray()));
    }

    private static void solucionAdecuada(){
        int[] array1=new int[]{1,2};
        int[] array2 = new int[]{3,4};
        int[] arrayMerged=new int[array1.length+array2.length];

        int contador=0;

        for (int i = 0; i < array1.length; i++) {
            arrayMerged[i]=array1[i];
            contador=i;
        }
        System.out.println(contador);

        System.out.println(contador);

        for (int i = 0; i < array2.length; i++) {
            contador+=1;
            arrayMerged[contador]=array2[i];
        }
        // [1,2,3,4]
        Arrays.sort(arrayMerged);


        double logBase2 = Math.log(8) / Math.log(2);
        System.out.println(logBase2);
    }
}

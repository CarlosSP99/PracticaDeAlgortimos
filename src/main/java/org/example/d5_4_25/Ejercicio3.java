package org.example.d5_4_25;


import java.util.ArrayList;
import java.util.Scanner;

//3. Find the nth Fibonacci number: Write a Java function that takes an integer n as input
// and returns the nth number in the Fibonacci sequence.
// The Fibonacci sequence is defined as follows: the first two numbers are 0 and 1,
// and each subsequent number is the sum of the previous two.
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("¿Que indice quieres obtener?");
        Scanner sc= new Scanner(System.in);
        int vueltas= sc.nextInt();

        int valor0=0;
        int valor1=1;
        int aux=0;
        ArrayList<Integer> fibonnacciList=new ArrayList<>();

        fibonnacciList.add(valor0);
        fibonnacciList.add(valor1);
        for (int i = 0; i < 8; i++) {
            aux=valor1;
            valor1=valor1+valor0;
            valor0=aux;
            fibonnacciList.add(valor1);
        }

        for (int numero: fibonnacciList){
            System.out.println(numero);
        }
    }
}

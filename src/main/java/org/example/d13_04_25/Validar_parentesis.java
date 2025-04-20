package org.example.d13_04_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Validar_parentesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Si es un paréntesis de apertura, lo metemos en la pila
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // Si hay un paréntesis de cierre pero la pila está vacía, ya está mal
                if (stack.isEmpty()) return false;
                System.out.println("El stack "+stack);
                // Sacamos el último paréntesis abierto
                char top = stack.pop();
                System.out.println("El stack "+stack);

                // Comprobamos si coincide con el de cierre actual
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Al final, si la pila está vacía, todo estaba bien
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String entrada = "({[]})";
        System.out.println(isValid(entrada));  // true

        entrada = "([)]";
        System.out.println(isValid(entrada));  // false

        entrada = "(";
        System.out.println(isValid(entrada));  // false
    }
}

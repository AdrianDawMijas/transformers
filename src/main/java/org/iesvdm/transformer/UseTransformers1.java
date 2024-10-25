package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers1 {
    public static void main(String[] args) {
        // Configura el escáner para entrada del usuario
        Scanner input = new Scanner(System.in);

        // Pide al usuario que ingrese una lista de enteros separados por espacios
        System.out.print("Enter a list of integers (separated by spaces): ");
        String line = input.nextLine();

        // Convierte la entrada en una `LispList<Integer>`
        LispList<Integer> ls1 = LispList.empty();
        String[] numbers = line.trim().split("\\s+"); // Divide la entrada en números
        for (int i = numbers.length - 1; i >= 0; i--) {
            ls1 = ls1.cons(Integer.parseInt(numbers[i].trim())); // Construye la lista
        }

        // Crea un transformador que multiplica por 10
        Transformer<Integer> trans = new TenTimes();

        // Aplica el transformador a la lista
        LispList<Integer> ls2 = Transformers.applyLispList(trans, ls1);

        // Muestra el resultado de la lista transformada
        System.out.println("Multiplying the contents by 10 gives: " + ls2);

        // Cierra el escáner
        input.close();
    }
}

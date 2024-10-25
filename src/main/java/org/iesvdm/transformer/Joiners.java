package org.iesvdm.transformer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Joiners {
    public static <T> LispList<T> zipLists(Joiner<T> joiner, LispList<T> ls1, LispList<T> ls2) {
        if (ls1.isEmpty() || ls2.isEmpty())
            return LispList.empty();
        else {
            T h = joiner.join(ls1.head(), ls2.head());
            LispList<T> t = zipLists(joiner, ls1.tail(), ls2.tail());

            return t.cons(h);
        }
    }
    // Ejercicio 4: Método `zipArrayList` en la clase `Joiners`
    public static <E> ArrayList<E> zipArrayList(Joiner<E> joiner, ArrayList<E> array1, ArrayList<E> array2) {
        // Si alguna lista está vacía, no se puede hacer el zip, por lo que retorna `null`.
        if (array1.isEmpty() || array2.isEmpty())
            return null;
        else {
            // Crea una nueva lista para almacenar los elementos combinados.
            ArrayList<E> array = new ArrayList<>();

            // Itera sobre los elementos de ambas listas.
            for (int i = 0; i < array1.size(); i++) {
                // Usa el `Joiner` para combinar elementos en la posición `i`.
                E result = joiner.join(array1.get(i), array2.get(i));
                array.add(result); // Añade el resultado combinado a la nueva lista.
            }
            return array; // Retorna la lista combinada.
        }
    }
    // Ejercicio 8: Método `fold` y pruebas

        // Método `fold` que combina los elementos de una lista usando un `Joiner`
        public static <E> E fold(Joiner<E> joiner, ArrayList<E> array1) {
            // Usa `stream` y `reduce` para combinar elementos usando el método `join` del `Joiner`
            return array1.stream()
                    .reduce(joiner::join)
                    .orElse(null); // Retorna `null` si la lista está vacía
        }

        public static void main(String[] args) {
            // Prueba con `JoinByAdding` para combinar una lista de enteros sumándolos
            Joiner<Integer> intJoiner = new JoinByAdding();
            ArrayList<Integer> intArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
            System.out.println("Sum of integers: " + fold(intJoiner, intArray)); // Esperado: 21

            // Prueba con `StringAdder` para combinar una lista de cadenas con espacios
            Joiner<String> stringJoiner = new StringAdder();
            ArrayList<String> stringArray = new ArrayList<>(List.of("Hello", "world", "from", "Joiners"));
            System.out.println("Joined strings: " + fold(stringJoiner, stringArray)); // Esperado: "Hello world from Joiners"
        }
    }

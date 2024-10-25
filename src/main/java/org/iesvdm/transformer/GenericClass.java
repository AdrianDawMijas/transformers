// Ejercicio 7: Clase genérica con un método que utiliza un objeto de tipo genérico.
package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<E> {
    // Método `genericMethod` que toma un objeto genérico y una lista para filtrar.
    public static <E> List<E> genericMethod(GenericType<E> generic, List<E> genericList) {
        List<E> list = new ArrayList<E>(); // Crea una nueva lista para almacenar los elementos que pasan la prueba.

        for (E item : genericList) {
            // Si el método `typeMethod` del objeto genérico devuelve `true`, añade el elemento a la lista.
            if (generic.typeMethod(item)) {
                list.add(item);
            }
        }
        return list; // Retorna la lista filtrada.
    }
}

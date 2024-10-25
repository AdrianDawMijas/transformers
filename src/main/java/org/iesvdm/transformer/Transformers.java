package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    // Ejercicio 2: Método `applyDest` en la clase `Transformers`
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        // Usa el método `applyConst` para crear una lista transformada, no destructiva.
        ArrayList<T> changedList = applyConst(tran, a);

        // Recorre la lista transformada y reemplaza los valores en `a`.
        for (T t : changedList) {
            // Se reemplaza cada elemento en la lista original `a` con el de `changedList`.
            a.set(changedList.indexOf(t), t);
        }
    }


    // Ejercicio 5: Método `applyLispList` en la clase `Transformers`
    public static <E> LispList<E> applyLispList(Transformer<E> tran, LispList<E> li) {
        // Si la lista está vacía, retorna una lista vacía.
        if (li.isEmpty()) {
            return LispList.empty();
        } else {
            // Aplica la transformación al primer elemento.
            E first = tran.transform(li.head());

            // Aplica recursivamente la transformación a la "cola" de la lista.
            LispList<E> liNext = applyLispList(tran, li.tail());

            // Añade el elemento transformado al inicio de la nueva lista.
            return liNext.cons(first);
        }
    }

}


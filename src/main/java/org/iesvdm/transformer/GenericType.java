// Interfaz GenericType: define un método de comprobación para objetos de tipo genérico `T`.
package org.iesvdm.transformer;

public interface GenericType<T> {
    // Método booleano `typeMethod`, que aplica una condición o comprobación sobre el objeto `T`.
    public boolean typeMethod(T object);
}

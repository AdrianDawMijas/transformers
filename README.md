# Transformaciones y Combinaciones en Java

Este proyecto explora conceptos de programación genérica, manipulación de listas y patrones funcionales en Java. Los ejercicios abarcan transformaciones destructivas y constructivas, combinaciones de listas y el uso de interfaces genéricas.

## Tabla de Contenidos

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Ejercicios](#ejercicios)
    - [Ejercicio 2: `applyDest`](#ejercicio-2-applydest)
    - [Ejercicio 3: `zipLists`](#ejercicio-3-ziplists)
    - [Ejercicio 4: `zipArrayLists`](#ejercicio-4-ziparraylists)
    - [Ejercicio 5: `applyLispList`](#ejercicio-5-applylisplist)
    - [Ejercicio 6: `HelloAdder` y `GreetingAdder`](#ejercicio-6-helloadder-y-greetingadder)
    - [Ejercicio 7: `GenericType` y `IntegerCheck`](#ejercicio-7-generictype-y-integercheck)
    - [Ejercicio 8: `fold`](#ejercicio-8-fold)
## Descripción del Proyecto

Este repositorio contiene implementaciones y pruebas en Java para una serie de transformaciones y combinaciones en listas y otros contenedores. Cada ejercicio aborda un aspecto específico de manipulación de datos genéricos, proporcionando ejemplos prácticos de uso de interfaces genéricas, métodos estáticos, transformadores y combinadores.

## Ejercicios

### Ejercicio 2: `applyDest`

Implementa el método estático `applyDest` en la clase `Transformers`. A diferencia del método constructivo `applyConst`, `applyDest` realiza cambios destructivos en su lista de entrada, modificándola directamente según una transformación especificada.

### Ejercicio 3: `zipLists`

Implementa el método `zipLists` en la clase `Joiners`. Este método toma dos `LispLists` y un objeto `Joiner`, y combina los elementos de ambas listas utilizando el método `join` del `Joiner`, produciendo una nueva lista unida.

### Ejercicio 4: `zipArrayLists`

Añade el método `zipArrayLists` en la clase `Joiners`. Similar a `zipLists`, este método combina dos `ArrayLists` utilizando un `Joiner`, devolviendo una lista con los elementos correspondientes unidos de ambas listas de entrada.

### Ejercicio 5: `applyLispList`

Crea el método `applyLispList` en la clase `Transformers`, que aplica un transformador sobre cada elemento de una `LispList`, devolviendo una nueva lista transformada.

### Ejercicio 6: `HelloAdder` y `GreetingAdder`

Implementa dos clases transformadoras:
- **`HelloAdder`**: Añade el saludo "Hello" al inicio de cualquier cadena de texto. Este transformador se puede utilizar para aplicar una transformación consistente en cualquier lista de cadenas.
- **`GreetingAdder`**: Generaliza `HelloAdder` permitiendo definir un saludo personalizado. Al crear un objeto `GreetingAdder`, se puede especificar un saludo que se añadirá a cada cadena. Esto se utiliza pasando un objeto `GreetingAdder` al método `applyLispList` o `applyDest` para aplicar un saludo específico a cada elemento de una lista.

### Ejercicio 7: `GenericType` y `IntegerCheck`

Crea una interfaz genérica `GenericType<T>` que define un método `check`. Implementa una clase `IntegerCheck` que verifica si un número entero es par y una clase `StringCheck` que verifica la longitud de una cadena. Luego, crea un método genérico que elimina elementos de una lista que no pasan el `check`.

### Ejercicio 8: `fold`

Implementa el método `fold` en la clase `Joiners`. Este método toma un `ArrayList` y un `Joiner` y combina todos los elementos de la lista en un solo elemento utilizando el método `join` del `Joiner`. Incluye pruebas con `JoinByAdding` para sumar enteros y con `StringAdder` para concatenar cadenas con espacios.


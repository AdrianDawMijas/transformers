package org.iesvdm.transformer;

import java.util.*;

public class UseJoiners1 {
    public static void main(String[] args) {
        // Configura el escáner para entrada del usuario
        Scanner in = new Scanner(System.in);

        // Pedir al usuario dos listas de enteros para la prueba con `LispList`
        System.out.print("Enter a list (of integers, format: [1, 2, 3]): ");
        String str = in.nextLine();
        LispList<Integer> ls1 = parseIntLispList(str);

        System.out.print("Enter another list (of integers, format: [4, 5, 6]): ");
        str = in.nextLine();
        LispList<Integer> ls2 = parseIntLispList(str);

        // Crear un Joiner para sumar elementos correspondientes de las listas
        Joiner<Integer> adder = new JoinByAdding();

        // Unir ambas listas usando `zipLists` y mostrar el resultado
        LispList<Integer> ls3 = Joiners.zipLists(adder, ls1, ls2);
        System.out.println("Adding corresponding integers in the lists gives:\n" + ls3);

        // Prueba con `ArrayList` usando `zipArrayList` para verificar su funcionamiento
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        ArrayList<Integer> result = Joiners.zipArrayList(adder, array1, array2);
        System.out.println("Adding corresponding integers in the ArrayLists gives:\n" + result);

        // Cerrar el escáner
        in.close();
    }

    // Método para convertir una cadena en formato `[1, 2, 3]` en una `LispList` de enteros
    public static LispList<Integer> parseIntLispList(String str) {
        String line = str.trim();
        String contents = line.substring(1, line.length() - 1).trim(); // Remueve los corchetes
        if (contents.length() == 0) {
            return LispList.empty(); // Retorna una lista vacía si no hay contenido
        }

        // Divide el contenido en números y construye la `LispList` de enteros
        String[] nums = contents.split(",");
        LispList<Integer> list = LispList.empty();
        for (int i = nums.length - 1; i >= 0; i--) {
            String num = nums[i].trim();
            list = list.cons(Integer.parseInt(num));
        }
        return list;
    }
}

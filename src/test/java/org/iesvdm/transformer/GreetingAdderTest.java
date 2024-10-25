package org.iesvdm.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class GreetingAdderTest {

    @Test
    public void GreentingApplyDest() {
        Transformer<String> transformerString = new GreetingAdder("Saludos");
        ArrayList<String> list = new ArrayList<>();
        list.add("Cesar");
        Transformers.applyDest(transformerString, list);
        String expected = "Saludos Cesar";
        Assertions.assertEquals(expected, list.getFirst());
    }

    @Test
    public void GreetingApplyLispList(){
        Transformer<String> transformerString = new GreetingAdder("Saludos");
        LispList<String> l1 = LispList.empty();
        String cesarito = "Cesar";
        String expected = "Saludos Cesar";
        LispList<String> l2 = Transformers.applyLispList(transformerString, l1.cons(cesarito));
        Assertions.assertEquals(expected,l2.head());
    }

}

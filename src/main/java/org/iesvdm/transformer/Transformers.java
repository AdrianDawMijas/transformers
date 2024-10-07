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
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> changedList = applyConst(tran,a);
        for(T t : changedList){
            a.set(changedList.indexOf(t), t);
        }
    }
}


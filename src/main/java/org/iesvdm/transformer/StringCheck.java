package org.iesvdm.transformer;

public class StringCheck implements GenericType<String> {

    private int filterlength;

    public StringCheck(int filterlength) {
        this.filterlength = filterlength;
    }

    public int getFilterlength() {
        return filterlength;
    }

    public void setFilterlength(int filterlength) {
        this.filterlength = filterlength;
    }

    @Override
    public boolean typeMethod(String object) {
        return object.length() > filterlength;
    }
}

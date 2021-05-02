package org.home.abs;

public abstract class Anymal {

    abstract String getName();

    abstract void voice(String message);

    public void sayYourName() {
        voice(getName());
    }

}
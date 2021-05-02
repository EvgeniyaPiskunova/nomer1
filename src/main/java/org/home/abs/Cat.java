package org.home.abs;

public class Cat extends Anymal {

    @Override
    public String getName() {
        return "murzik";
    }

    @Override
    public void voice(String message) {
        System.err.println(message);
    }
}

package org.home.abs;

public class Dog extends Anymal {

    @Override
    public String getName() {
        return "sharik";
    }

    @Override
    public void voice(String message) {
        System.out.println(message);
    }
}

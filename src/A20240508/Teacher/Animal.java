package A20240508.Teacher;

public abstract class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void newAbstractMethod();

    public final void WhatCanISay(String Saying){
        System.out.println("hhhhh Man! What can I say ? mamba out");
    }
}

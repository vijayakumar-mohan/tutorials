package com.baeldung.ditypes.constructordi.domain;

public class Cubicle {

    private String name;

    public Cubicle(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cubicle [name=" + name + "]";
    }

}

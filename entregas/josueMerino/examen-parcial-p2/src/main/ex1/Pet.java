package main.ex1;

public class Pet {
    protected String name;
    protected String color;
    protected int age;

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

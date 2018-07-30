package com.java.se.schoolofnet;

public class Person {

//    private String colorHair;
//    private String colorEye;
//    private float height;
    public String colorHair;
    public String colorEye;
    public float height;

    public Person() {
        System.out.println("Executing Constructor!");
    }

    public Person(String colorHair, String colorEye, float height) {
        this.colorHair = colorHair;
        this.colorEye = colorEye;
        this.height = height;
    }

    public void walk() {
        System.out.println("I'm walking...");
    }

    @Override
    public String toString() {
        return "Person {\n" +
                "\tcolorHair='" + colorHair + '\'' +
                "\n\tcolorEye='" + colorEye + '\'' +
                "\n\theight=" + height +
                "\n}";
    }
}

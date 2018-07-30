package com.java.se.schoolofnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWord {

    public void function1() {
        Boolean ba = new Boolean(true);//wrapper
        boolean bb = false;//primitive

        if (ba.booleanValue()) {
            System.out.println(ba.toString());
        }

        if (!bb) {
            System.out.println(bb);
        }

        System.out.println("Hello Word!!");

        Person a = new Person();
        Person b = new Person("Gold","Green",(float) 1.67);

        a.colorHair = "Black";
        a.colorEye = "Blue";
        a.height = (float) 1.85;

        System.out.println("Person A: "+a.toString());
        System.out.println("Person B: "+b.toString());

        a.walk();
    }

    public void function2() {

        System.out.println("function2() executing...\n");

        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g =  a % b;
        float h = (float) a / (float) b;
        a++;
        int i = a;
        b--;
        int j = b;

        System.out.println("a + b \t= "+c);
        System.out.println("a - b \t= "+d);
        System.out.println("a * b \t= "+e);
        System.out.println("a / b \t= "+f);
        System.out.println("a % b \t= "+g);
        System.out.println("a / b \t= "+h+" (float)");
        System.out.println("a++ \t= "+i);
        System.out.println("b-- \t= "+j);

        a--;
        System.out.println(a+" "+g);

        if (a == g) {
            System.out.println("a equal g");
        }
        if (a != b) {
            System.out.println("a not equal b");
        }

        // && Logical AND
        // || Logical OR
        // ! Logical NOT

        boolean ba = !(a >= g);

        System.out.println(ba);

    }

    public Double sum(Double x, Double y) {
        return x + y;
    }
    public Double sub(Double x, Double y) {
        return x - y;
    }
    public Double mult(Double x, Double y) {
        return x * y;
    }
    public Double div(Double x, Double y) {
        if (y == 0) {
            return null;
        }
        return x / y;
    }

    public void calculator(Double x, Double y, int op) {
        switch (op) {
            case 1:
                System.out.println(x + " + " + y + " = " + sum(x, y));
                break;
            case 2:
                System.out.println(x + " - " + y + " = " + sub(x, y));
                break;
            case 3:
                System.out.println(x + " * " + y + " = " + mult(x, y));
                break;
            case 4:
                Double result = div(x, y);
                if (result == null) {
                    System.out.println("Invalid Operation!!");
                } else {
                    System.out.println(x + " / " + y + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid Option!!");
                break;
        }
    }

    public void functionArrayCollectio() {
        int[] ages = new int[10];

        ages[0]=10;
        ages[1]=30;

        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(30);

        System.out.println("List:\n"+list.toString());

        System.out.println("size list = "+list.size());

        if (list.remove(list.get(0))) System.out.println("index 0 removed");

        System.out.println("List:\n"+list.toString());

        System.out.println("First element in List: "+list.get(0));

        System.out.println("size list = "+list.size());

        int sum = 0;

        for (int i = 0; i > list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        //foreach
        for (int i : list) {
            sum += i;
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HelloWord helloWord = new HelloWord();

        System.out.println("What is your name?");

        String name = reader.nextLine();
        System.out.println("Wellcome " + name + "!");

        String num1_calculator = "Type number 1: ";
        String num2_calculator = "Type number 2: ";
        String op_calculator   = "\nChoose an option:\n" +
                "\t1 - sum  (+)\n" +
                "\t2 - sub  (-)\n" +
                "\t3 - mult (*)\n" +
                "\t4 - div  (/)\n" +
                "";

        String menu = "\nChoose an option:\n" +
                "\t1 - funcao1()\n" +
                "\t2 - funcao2()\n" +
                "\t3 - calculator()\n" +
                "\t4 - functionArrayCollectio()\n" +
                "\t0 - exit\n" +
                "";

        while (true) {

            System.out.println(menu.toUpperCase());

            switch (reader.nextInt()) {
                case 1:
                    helloWord.function1();
                    break;
                case 2:
                    helloWord.function2();
                    break;
                case 3:
                    System.out.println(op_calculator);
                    int op = reader.nextInt();

                    System.out.println(num1_calculator);
                    Double x = reader.nextDouble();
                    System.out.println(num2_calculator);
                    Double y = reader.nextDouble();

                    helloWord.calculator(x, y, op);
                    break;
                case 4:
                    helloWord.functionArrayCollectio();
                    break;
                case 0:
                    System.out.println("Bye " + name + "!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!!");
            }

        }
    }
}

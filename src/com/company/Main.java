package com.company;

import java.util.*;

public class Main {

    static void firsttask() {
        String[] colors = {"red", "green", "blue", "yellow", "purple", "black", "white"};
        ArrayList<String> colorsl = new ArrayList<String>();
        for (int i = 0; i < colors.length; i++) {
            colorsl.add(colors[i]);
        }
        colorsl.remove(2);
        colorsl.add(colorsl.size(), "grey");
        for (String i : colorsl) {
            System.out.println(i);
        }
        System.out.println("-----sublist-----");
        ArrayList<String> colorssubl = new ArrayList<String>();
        colorssubl.addAll(colorsl.subList(2, 5));
        for (int i = 0; i < colorssubl.size(); i++) {
            System.out.println(colorssubl.get(i));
        }
    }

    public final class Text {

        public static final String TEXT =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in " +
                        "OOP occurs when a parent class reference is used to refer to a child class object\n" +
                        "\n" +
                        "Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all " +
                        "Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object\n" +
                        "\n" +
                        "It is important to know that the only possible way to access an object is through a reference variable " +
                        "A reference variable can be of only one type Once declared the type of a reference variable cannot be changed\n" +
                        "\n" +
                        "The reference variable can be reassigned to other objects provided that it is not declared final The " +
                        "type of the reference variable would determine the methods that it can invoke on the object\n" +
                        "\n" +
                        "A reference variable can refer to any object of its declared type or any subtype of its declared type" +
                        " A reference variable can be declared as a class or interface type";

        private Text() {

        }
    }

    static void secondtask() {
        ArrayList<String> txt = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : Text.TEXT.split("\\s+")){
            txt.add(i.toLowerCase());
            if (map.containsKey(i.toLowerCase()))
                map.replace(i.toLowerCase(), map.get(i.toLowerCase()) + 1);
            else
                map.put(i.toLowerCase(), 1);
        }
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int choice=-1;
        do{
            try {
                choice = inpt.nextInt();
                switch (choice) {
                    case 1:
                        firsttask();
                        break;
                    case 2:
                        secondtask();
                        break;
                    case 0:
                        System.out.println("goodbye!");
                        break;
                    default:
                        System.out.println("there are only tasks 1-2");
                        break;
                }
            }catch (Exception e){
                inpt.next();
                System.out.println("tasks are marked by whole numbers onyl!");
            }
        }while(choice!=0);
    }
}
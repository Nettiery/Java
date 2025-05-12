package exercise4;

import java.util.Locale;
import java.util.Scanner;

abstract class Animal {


    Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
            this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;

}

class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }
    public String toString(){
        return "Dog name = " + getName() + ", age = " + getAge();
    }
}

class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }
    public String toString(){
        return "Cat name = " + getName() + ", age = " + getAge();
    }
}



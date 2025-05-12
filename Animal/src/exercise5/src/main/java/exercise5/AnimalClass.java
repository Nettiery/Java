package exercise5;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

    abstract Double goToWalk();

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

    public Double goToWalk(){
        Double time = getAge() * 0.5;
        try {
            TimeUnit.SECONDS.sleep(time.longValue());
        }
        catch (Exception e){
            System.out.println("Walk has been interrupted");
        }
        return time;
    }
}

class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }
    public String toString(){
        return "Cat name = " + getName() + ", age = " + getAge();
    }

    public Double goToWalk(){
        Double time = getAge() * 0.25;
        try {
            TimeUnit.SECONDS.sleep(time.longValue());
        }
        catch (Exception e){
            System.out.println("Walk has been interrupted");
        }
        return time;
    }
}



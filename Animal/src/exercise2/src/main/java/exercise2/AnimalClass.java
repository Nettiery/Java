package exercise2;

import java.util.Locale;
import java.util.Scanner;

abstract class Animal {


    Animal(String name, int age, double weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    double getWeight() {
        return weight;
    }

    void setAge(int age) {
            this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    abstract double getFeedInfoKg();

    private String name;
    private int age;
    private double weight;

}

class Dog extends Animal{
    Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    public String toString(){
        return "Dog name = " + getName() +
                ", age = " + getAge() +
                ", mass = " + getWeight() +
                ", feed = " + getFeedInfoKg();
    }

    public double getFeedInfoKg(){
        return this.getWeight() * 0.3;
    }
}

class Cat extends Animal{
    Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    public String toString(){
        return "Cat name = " + getName() +
                ", age = " + getAge() +
                ", mass = " + getWeight() +
                ", feed = " + getFeedInfoKg();
    }

    public double getFeedInfoKg(){
        return this.getWeight() * 0.1;
    }
}



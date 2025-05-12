package exercise3;

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

interface Herbivore{
    String chill();
}

interface Omnivore{
    String hunt();
}

class Dog extends Animal implements Omnivore{
    Dog(String name, int age) {
        super(name, age);
    }


    public String toString(){
        return "Dog name = " + getName() +
                ", age = " + getAge() +
                ". " + hunt();
    }

    public String hunt(){
        return "I can hunt for robbers";
    }
}

class Cat extends Animal implements Omnivore {
    Cat(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Cat name = " + getName() +
                ", age = " + getAge() +
                ". " + hunt();
    }

    public String hunt() {
        return "I can hunt for mice";
    }
}
    class Hamster extends Animal implements Herbivore {
        Hamster(String name, int age) {
            super(name, age);
        }

        public String toString() {
            return "Hamster name = " + getName() +
                    ", age = " + getAge() +
                    ". " + chill();
        }

        public String chill() {
            return "I can chill for 8 hours";
        }
    }

    class GuineaPig extends Animal implements Herbivore {
        GuineaPig(String name, int age) {
            super(name, age);
        }

        public String toString() {
            return "GuineaPig name = " + getName() +
                    ", age = " + getAge() +
                    ". " + chill();
        }

        public String chill() {
            return "I can chill for 12 hours";
        }
    }




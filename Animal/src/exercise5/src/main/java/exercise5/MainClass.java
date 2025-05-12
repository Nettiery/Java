package exercise5;

import java.util.Locale;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        try {
            long start = System.currentTimeMillis();
            int size = UserInput();
            List<Animal> Pets = new ArrayList<>();
            Pets = UserInputList(size);
            Walking(Pets, start);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int UserInput() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.print("Couldn't parse a number. Please, try again\n");
            in.next();
        }
        return in.nextInt();
    }

    public static List<Animal> UserInputList(int size) {
        List<Animal> Pets = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String type;
        for (int i = 0; i < size; ++i) {
            Animal newPet;
            type = in.next();
            in.nextLine();
            if (type.equalsIgnoreCase("dog")) {
                newPet = new Dog(null, 0);
            } else if (type.equalsIgnoreCase("cat")) {
                newPet = new Cat(null, 0);
            } else {
                System.out.println("Incorrect input. Unsupported pet type");
                continue;
            }
            String newName = in.next();
            in.nextLine();
            int newAge = UserInput();
            if (newAge > 0) {
                newPet.setName(newName);
                newPet.setAge(newAge);
                Pets.add(newPet);
            } else {
                System.out.println("Incorrect input. Age <= 0");
            }
        }
        return Pets;
    }

    public static void Walking(List<Animal> pets, long programStart){
        for (Animal element: pets){
            Runnable walkTread = () -> {
                long start = System.currentTimeMillis() - programStart;
                element.goToWalk();
                long finish = System.currentTimeMillis()- programStart;
                System.out.println(element.toString() + ", start time = " + String.format("%.2f", (start / 1000.0))+ ", end time = " + String.format("%.2f", (finish / 1000.0)));
            };
            Thread mythread = new Thread(walkTread);
            mythread.start();
        }
    }
}

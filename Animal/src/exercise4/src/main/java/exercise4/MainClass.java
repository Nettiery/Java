package exercise4;

import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        try {
            int size = UserInput();
            List<Animal> Pets = new ArrayList<>();
            Pets = UserInputList(size);
            IncreaseAge(Pets);
            UserOutPut(Pets);
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

    public static List<Animal> IncreaseAge(List<Animal> pets){
        pets.stream()
                .filter(p->p.getAge() > 10)
                    .forEach(p->p.setAge(p.getAge() + 1));
        return pets;
    }

    public static void UserOutPut(List<Animal> pets) {
        for (Animal element : pets) {
            System.out.println(element.toString());
        }
    }
}

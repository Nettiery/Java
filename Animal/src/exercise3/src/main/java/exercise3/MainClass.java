package exercise3;

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
            switch (type) {
                case ("dog"):
                    newPet = new Dog(null, 0);
                    break;
                case ("cat"):
                    newPet = new Cat(null, 0);
                    break;
                case ("hamster"):
                    newPet = new Hamster(null, 0);
                    break;
                case ("guinea"):
                    newPet = new GuineaPig(null, 0);
                    break;
                default:
                    System.out.println("Incorrect input. Unsupported pet type");
                    continue;
            }
            String newName = in.next();
            in.nextLine();
            int newAge = UserInput();
            if (newAge <= 0) {
                System.out.println("Incorrect input. Age <= 0");
            } else
                    {
                        newPet.setName(newName);
                        newPet.setAge(newAge);
                        Pets.add(newPet);
                    }
            }
        return Pets;
    }

    public static void UserOutPut(List<Animal> pets) {
        for (Animal element : pets) {
            System.out.println(element.toString());
        }
    }
}

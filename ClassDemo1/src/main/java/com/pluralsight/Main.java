package com.pluralsight;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the person's full name: ");

        String fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear the C-R-L-F

        System.out.print("What us the person's profession: ");
        String profession = scanner.nextLine();

        displayPerson(fullName, age, profession);
        savePerson(fullName, age, profession);
        



    }

    public static void displayPerson(String fullName, int age, String profession){

        System.out.printf("Person %s is a %s and is %d years old", fullName, profession, age);

    }


    public static void savePerson(String fullName, int age, String profession){

        //do the work of saving a person to a database

    }
}
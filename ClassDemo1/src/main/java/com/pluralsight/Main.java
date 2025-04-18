package com.pluralsight;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;
        int age;
        String profession;

        System.out.print("What is the person's full name: ");

        fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the C-R-L-F

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        Person thePerson = new Person(fullName, age, profession);



        System.out.print("What is the person's full name: ");

        fullName = scanner.nextLine();

        System.out.print("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the C-R-L-F

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();
        Person theOtherPerson = new Person(fullName, age,profession);



        thePerson.haveABirthday();
        System.out.println(thePerson);
        System.out.println(theOtherPerson);
        System.out.printl


    }

    public static void displayPerson(Person person){

        //System.out.println(person.toString());

    }


    public static void savePerson(String fullName, int age, String profession){

        //do the work of saving a person to a database

    }
}
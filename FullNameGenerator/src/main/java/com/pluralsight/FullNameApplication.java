package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        //First Name
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim().toUpperCase();
        //Middle Name
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();
        middleName = middleName.trim().toUpperCase();
        //Last Name
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim().toUpperCase();
        //Suffix
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim().toUpperCase();

        //Full Name String
        String fullName = " ";

        if(middleName.isBlank()){

            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }

        if (!suffix.isBlank()){
            fullName += ", " + suffix;

        }
        System.out.println("Full name: " + fullName);

    }
}

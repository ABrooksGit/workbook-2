package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.println("What is your full name?: ");
        String name = scanner.nextLine().trim();

        //calculate the unknown
        int firstSpaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, firstSpaceIndex);
        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex + 1 );

        String middleName;
        String lastName;


        if(secondSpaceIndex >= 0){
            //middle last
            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
            lastName = name.substring(secondSpaceIndex + 1);


        } else {
            // only last name
            middleName ="(None)";
            lastName = name.substring(firstSpaceIndex +1);
        }

        //display the results
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);



    }

    public static void SecondWay(String[] args){
        String name = "";
        String[] names = name.split(Pattern.quote(" "));

        String firstName = names[0];
        String middleName;
        String lastName;

        if(names.length == 2){
            middleName = "(None)";
            lastName = names[1];
        } else{
            middleName = names[1];
            lastName = names[2];
        }

        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);



    }
}
package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;


        System.out.print("What is the serial number?: ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier?: ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number?: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone?: ");
        owner = scanner.nextLine();

        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber,owner);
//      CellPhone cellPhone2 = new CellPhone(serialNumber, model, carrier, phoneNumber,owner);

        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());

        cellPhone.dial("212-515-9999");




    }
}

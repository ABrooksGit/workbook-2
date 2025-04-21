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

        CellPhone phone = new CellPhone(serialNumber, model, carrier, phoneNumber,owner);
//      CellPhone cellPhone2 = new CellPhone(serialNumber, model, carrier, phoneNumber,owner);

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());

        phone.dial("212-515-9999");
        phone.dial("615-349-2840");




    }
}

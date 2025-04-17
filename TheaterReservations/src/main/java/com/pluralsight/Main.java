package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("What date will you be coming(MM/dd/yyyy): ");
        String dateComing = scanner.nextLine();
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate event = LocalDate.parse(dateComing, formatter);

        System.out.println("How many tickets would you like? ");
        String ticketAmount;
        ticketAmount = scanner.nextLine();

        if (ticketAmount.equals("1")){

            System.out.println(ticketAmount + " ticket Reserved for " + dateComing + " Under " + name );
        } else if(ticketAmount.equals("0")){
            System.out.println("Incorrect");
        } else{
            System.out.println(ticketAmount + " tickets Reserved for " + dateComing + " Under " + name );
        }












    }
}
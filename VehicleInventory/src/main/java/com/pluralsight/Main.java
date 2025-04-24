package com.pluralsight;


public class Main {
    private static Vehicle[] Vehicles = getAllVehicles();
    private static Console console = new Console();



    public static void main(String[] args) {

        mainScreen();

    }


    private static void mainScreen() {
    int input;

do {

    String homeScreenPrompt =
            "What do you want to do: \n" +
            " 1 - List all vehicles \n" +
            " 2 - Search by make/model \n" +
            " 3 -  Search by price range\n" +
            " 4 -  Search by color\n" +
            " 5 -  Add a vehicle\n" +
            " 6 -  Quit\n" +
            "Enter your command(number 1-6): ";

    input = console.promptForInt(homeScreenPrompt);

    switch (input) {
        case 1:
            showAllVehicles();
            break;
        case 2:
            searchByModel();
            break;
        case 3:
            findVehiclesByPrice();
            break;
        case 4:
            searchByColor();
            break;
        case 5:
            addAVehicle();
            break;
        case 6:
            return;


    }
} while(input != 6);

    }


    private static void showAllVehicles() {

        int i;
        for (i = 0; i < Vehicles.length; i++) {
            Vehicle vehicle = Vehicles[i];
            if(vehicle == null){
                continue;
            }
            System.out.println(vehicle.getFormattedVehicleText());
        }

    }


    private static void searchByModel(){

        String inputModel = console.promptForString("Type A Model Here: ").toUpperCase();

        for (Vehicle vehicle : getAllVehicles()) {
            if(vehicle == null){
                continue;
            }
            if (vehicle.getMakeModel().equals(inputModel)) {
                System.out.println(vehicle.showSpecificVehicleByValue());

            }
        }
    }


    private  static void searchByColor(){

        String inputColor = console.promptForString("Type A Color Here: ").toUpperCase();
        for (Vehicle vehicle : getAllVehicles()) {
            if(vehicle == null){
                continue;
            }
            if (vehicle.getColor().equals(inputColor)) {
                System.out.println(vehicle.showSpecificVehicleByValue());

            }
        }
    }


    private static void findVehiclesByPrice() {

        int inputPrice = console.promptForInt("Type A Price Here: ");

        for (Vehicle vehicle : getAllVehicles()) {
            if(vehicle == null){
                continue;
            }
            if (vehicle.getPrice() == inputPrice) {
                System.out.println(vehicle.showSpecificVehicleByValue());

            }
        }
    }

    private static void addAVehicle() {
        long id = console.promptForInt("Please Enter The ID of your Vehicle: ");
        String model = console.promptForString("Please Enter Your Vehicle Model: ").toUpperCase();
        String color = console.promptForString("Please Enter your Vehicle's Color: ").toUpperCase();
        int odometer = console.promptForInt("Please Enter Odometer Reading: ");
        float price = console.promptForInt("Finally, Please Enter Your Vehicles Price: ");

        Vehicle newvehicle = new Vehicle(id, model,color,odometer,price);

        for(int i = 0; i < Vehicles.length; i++){
            if (Vehicles[i] == null){
                Vehicles[i] = newvehicle;
                break;
            }
        }



    }


    public static Vehicle[] getAllVehicles() {

       Vehicle[] inventory = new Vehicle[20];


        //vehicleId,makeModel,color,odometerReading,price;
        inventory[0] = new Vehicle(101121, "FORD EXPLORER", "RED", 45000, 13500);
        inventory[1] = new Vehicle(101122, "TOYOTA CAMRY", "BLUE", 60000, 11000);
        inventory[2] = new Vehicle(101123, "CHEVROLET MALIBU", "BLACK", 50000, 9700);
        inventory[3] = new Vehicle(101124, "HONDA CIVIC", "WHITE", 70000, 7500);
        inventory[4] = new Vehicle(101125, "SUBARU OUTBACK", "GREEN", 55000, 14500);
        inventory[5] = new Vehicle(101126, "JEEP WRANGLER", "YELLOW", 30000, 16000);

        return inventory;
    }





}













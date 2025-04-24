package com.pluralsight;

public class Vehicle {

    private long vehicleId;
    private String makeModel ;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public String getColor() {
        return color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFormattedVehicleText(){
        return String.format("%-5d %-20s %-9s %-5d %-5f ", this.vehicleId,this.makeModel,this.color, this.odometerReading, this.price);
    }
    public String showSpecificVehicleByValue(){
        return ("Vehicle ID: " + this.vehicleId + ", Make/Model: " + this.makeModel + ", Color: " + this.color +
                ", Odometer Reading: " + this.odometerReading + ", Price: " + this.price);
    }
}


package com.pluralsight;

public class CellPhone {

  private int serialNumber =  0;
  private String model = " ";
  private String carrier = " ";
  private String phoneNumber = " ";
  private String owner = " ";

  public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){

      this.serialNumber = serialNumber;
      this.model=model;
      this.carrier=carrier;
      this.phoneNumber = phoneNumber;
      this.owner=owner;

  }

  public void dial (String phoneNumber){
      System.out.printf("%s's Cellphone is dialing the number %s from the number %s\n ", this.owner, phoneNumber, this.getPhoneNumber());
  }
    public void dial(CellPhone phone){
        System.out.printf("%s's Cellphone is dialing the number %s from the number %s\n ", this.owner, phone.phoneNumber, this.getPhoneNumber());
    }

  public  int getSerialNumber(){
      return this.serialNumber;
  }

  public void setSerialNumber(int serialNumber){
      this.serialNumber = serialNumber;
  }


  public String getModel(){
      return this.model;
  }
  public void setModel(String model){
      this.model = model;
  }


  public String getCarrier(){
      return this.carrier;
  }
  public  void setCarrier(String carrier){
      this.carrier = carrier;
  }


  public  String getPhoneNumber(){
      return this.phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
  }

  public  String getOwner(){
      return this.owner;
  }
  public  void setOwner(String owner){
      this.owner = owner;
  }





}

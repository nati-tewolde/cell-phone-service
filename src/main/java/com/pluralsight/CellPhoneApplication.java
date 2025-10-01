package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone firstPhone = new CellPhone();
        CellPhone secondPhone = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = input.nextInt();
        input.nextLine();

        System.out.print("What model is the phone? ");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.print("Who is the owner? ");
        String owner = input.nextLine();

        System.out.println("===============================================");

        System.out.print("What is the serial number of the second phone? ");
        int serialNumber2 = input.nextInt();
        input.nextLine();

        System.out.print("What model is the of the second phone? ");
        String model2 = input.nextLine();

        System.out.print("Who is the carrier for the second phone? ");
        String carrier2 = input.nextLine();

        System.out.print("What is the phone number of the second phone? ");
        String phoneNumber2 = input.nextLine();

        System.out.print("Who is the owner of the second phone? ");
        String owner2 = input.nextLine();

        System.out.println("============================================");

        firstPhone.setSerialNumber(serialNumber);
        firstPhone.setModel(model);
        firstPhone.setCarrier(carrier);
        firstPhone.setPhoneNumber(phoneNumber);
        firstPhone.setOwner(owner);

        secondPhone.setSerialNumber(serialNumber2);
        secondPhone.setModel(model2);
        secondPhone.setCarrier(carrier2);
        secondPhone.setPhoneNumber(phoneNumber2);
        secondPhone.setOwner(owner2);

        System.out.println("Serial number: " + firstPhone.getSerialNumber());
        System.out.println("Model: " + firstPhone.getModel());
        System.out.println("Carrier: " + firstPhone.getCarrier());
        System.out.println("Phone number: " + firstPhone.getPhoneNumber());
        System.out.println("Owner: " + firstPhone.getOwner());

        System.out.println("============================================");

        display(firstPhone);
        System.out.println("============================================");
        display(secondPhone);

        System.out.println("============================================");

        firstPhone.dial(secondPhone.getPhoneNumber());
        secondPhone.dial(firstPhone.getPhoneNumber());

    }

    public static void display(CellPhone phone) {
        System.out.println("Your phone's serial number is: " + phone.getSerialNumber());
        System.out.println("The model of your phone is: " + phone.getModel());
        System.out.println("Your phone's carrier is: " + phone.getCarrier());
        System.out.println("Your phone number is: " + phone.getPhoneNumber());
        System.out.println("The owner of this phone is: " + phone.getOwner());
    }


}

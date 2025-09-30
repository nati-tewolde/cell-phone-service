package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone firstUser = new CellPhone();

        Scanner input = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        int serialNumber = input.nextInt();
        input.nextLine();

        System.out.print("What model is the carrier? ");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.print("Who is the owner? ");
        String owner = input.nextLine();

        firstUser.setSerialNumber(serialNumber);
        firstUser.setModel(model);
        firstUser.setCarrier(carrier);
        firstUser.setPhoneNumber(phoneNumber);
        firstUser.setOwner(owner);

        System.out.println("Serial number: " + firstUser.getSerialNumber());
        System.out.println("Model: " + firstUser.getModel());
        System.out.println("Carrier: " + firstUser.getCarrier());
        System.out.println("Phone number: " + firstUser.getPhoneNumber());
        System.out.println("Owner: " + firstUser.getOwner());

    }
}

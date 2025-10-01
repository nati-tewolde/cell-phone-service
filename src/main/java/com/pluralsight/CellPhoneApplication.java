package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone firstPhone = new CellPhone();
        CellPhone secondPhone = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = input.nextInt();
        firstPhone.setSerialNumber(serialNumber);
        input.nextLine();

        System.out.print("What model is the phone? ");
        String model = input.nextLine();
        firstPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();
        firstPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();
        firstPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner? ");
        String owner = input.nextLine();
        firstPhone.setOwner(owner);

        System.out.println("============================================");

        System.out.print("What is the serial number of the second phone? ");
        int serialNumber2 = input.nextInt();
        secondPhone.setSerialNumber(serialNumber2);
        input.nextLine();

        System.out.print("What model is the second phone? ");
        String model2 = input.nextLine();
        secondPhone.setModel(model2);

        System.out.print("Who is the carrier for the second phone? ");
        String carrier2 = input.nextLine();
        secondPhone.setCarrier(carrier2);

        System.out.print("What is the phone number of the second phone? ");
        String phoneNumber2 = input.nextLine();
        secondPhone.setPhoneNumber(phoneNumber2);

        System.out.print("Who is the owner of the second phone? ");
        String owner2 = input.nextLine();
        secondPhone.setOwner(owner2);

        System.out.println("============================================");
        System.out.println("Serial number: " + firstPhone.getSerialNumber());
        System.out.println("Model: " + firstPhone.getModel());
        System.out.println("Carrier: " + firstPhone.getCarrier());
        System.out.println("Phone number: " + firstPhone.getPhoneNumber());
        System.out.println("Owner: " + firstPhone.getOwner());

        System.out.println("============================================");
        System.out.print("What is the serial number of the third phone? ");
        int serialNumber3 = input.nextInt();
        input.nextLine();

        System.out.print("What model is the third phone? ");
        String model3 = input.nextLine();

        System.out.print("Who is the carrier for the third phone? ");
        String carrier3 = input.nextLine();

        System.out.print("What is the phone number of the third phone? ");
        String phoneNumber3 = input.nextLine();

        System.out.print("Who is the owner of the third phone? ");
        String owner3 = input.nextLine();
        System.out.println("============================================");

        CellPhone thirdPhone = new CellPhone(serialNumber3, model3, carrier3, phoneNumber3, owner3);

        display(firstPhone);
        System.out.println("============================================");
        display(secondPhone);
        System.out.println("============================================");
        display(thirdPhone);
        System.out.println("============================================");

        firstPhone.dial(secondPhone.getPhoneNumber());
        secondPhone.dial(firstPhone.getPhoneNumber());

        thirdPhone.dial(secondPhone);

        input.close();
    }

    public static void display(CellPhone phone) {
        System.out.println("Your phone's serial number is: " + phone.getSerialNumber());
        System.out.println("The model of your phone is: " + phone.getModel());
        System.out.println("Your phone's carrier is: " + phone.getCarrier());
        System.out.println("Your phone number is: " + phone.getPhoneNumber());
        System.out.println("The owner of this phone is: " + phone.getOwner());
    }

}

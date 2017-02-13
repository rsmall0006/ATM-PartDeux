package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

public class ATM2 {
// I had to create a public static Scanner called scannerDouble = new Scanner(System.in); or else I would have had issues
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerDouble = new Scanner(System.in);
    public static Customer customer = new Customer();
//    public static Customers customers = new Customers();

//    public static Person person = new Person();
// I did not need this public static Person above; but I did need to go and actually create a Person "Class" and then
    //go in to that tab and actually create "getters and setters" using Code - Generate - Getters and Setters
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome, customer");


        customer.chooseName();
        customer.chooseRemove();
        customer.chooseDesire();
        customer.chooseResponse();


        customer.doAction(1);
        customer.chooseResponse();


        customer.doAction(2);
        customer.chooseResponse();


        customer.doAction(3);
        customer.chooseResponse();


        customer.doAction(4);
        customer.chooseResponse();


        customer.doAction(5);
        customer.chooseResponse();


        customer.doAction(6);
        customer.chooseResponse();


        customer.doAction(7);
        customer.chooseResponse();


        customer.doAction(8);
        customer.chooseResponse();


        customer.doAction(9);
        customer.chooseResponse();


        customer.doAction(10);
        customer.chooseResponse();

    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("-")) {
            switch (line) {
                case "-inv":
                    for (Integer actions : customer.actions) {
                        System.out.println(actions);
                    }
                    break;
                case "-exit":
                    System.exit(0);
                    break;

                 default:
                     System.out.println("Command not understood");
                     break;

            }
            line = scanner.nextLine();

        }
        return line;


    }
}

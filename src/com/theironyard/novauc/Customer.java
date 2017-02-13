package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    String name;
    public String desire;
    double response;
    double balance;

    ArrayList<Integer> actions = new ArrayList<>();

    public void doAction(Integer action) {
        System.out.println("You have completed transaction # " + action + "; would you like to do another transaction? If yes, type in yes and press Enter. If no, type in -exit and press Enter. If you would like to see how many transactions you have completed previously, type in -inv and press Enter. You can make a total of 10 transactions.");
        String answer = ATM2.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            actions.add(action);
            System.out.println("This transaction has been recorded");
        }

    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

public void chooseName() throws Exception {
         HashMap<String, Double> bbustomers = new HashMap();
         bbustomers.put("Andy", 500.00);
         bbustomers.put("Becky", 600.00);
         bbustomers.put("Beth", 650.00);
         bbustomers.put("Dora", 750.00);
         bbustomers.put("Elizabeth", 800.00);
         bbustomers.put("Frank", 900.00);
         bbustomers.put("Gary", 775.00);
         bbustomers.put("Harry", 820.00);
         bbustomers.put("Jack", 940.00);
         bbustomers.put("Laura", 1000.00);
         bbustomers.put("Maddy", 1150.00);
         bbustomers.put("Peter", 860.00);
         bbustomers.put("Steven", 770.00);
         bbustomers.put("Tucker", 1200.00);
         bbustomers.put("New Customer", 1250.00);

    System.out.println("What is your name? (press Enter after entering your name)");
    name = ATM2.scanner.nextLine();

        if (bbustomers.containsKey(name)) {
        System.out.println("Welcome! " + name + ", your balance is $" + bbustomers.get(name));
        balance = bbustomers.get(name);

    } else {
        System.out.println("You do not have an account with our bank, " + name);
        System.out.println("Please type your name exactly as you would like it to appear on your account below and press Enter");
        name = ATM2.scanner.nextLine();
        System.out.println("How much money would you like to add to your account " + name + "? (example: 200.00, 500.00)");
        balance = ATM2.scannerDouble.nextDouble();
        bbustomers.put(name, balance);

    }
}

public void chooseRemove() {
    HashMap<String, Double> bbustomers = new HashMap();
    bbustomers.put("Andy", 500.00);
    bbustomers.put("Becky", 600.00);
    bbustomers.put("Beth", 650.00);
    bbustomers.put("Dora", 750.00);
    bbustomers.put("Elizabeth", 800.00);
    bbustomers.put("Frank", 900.00);
    bbustomers.put("Gary", 775.00);
    bbustomers.put("Harry", 820.00);
    bbustomers.put("Jack", 940.00);
    bbustomers.put("Laura", 1000.00);
    bbustomers.put("Maddy", 1150.00);
    bbustomers.put("Peter", 860.00);
    bbustomers.put("Steven", 770.00);
    bbustomers.put("Tucker", 1200.00);
    bbustomers.put("New Customer", 1250.00);

//    System.out.println("Please type in your name again");

    System.out.println(name + ", would you like to remove your account? (yes or no)");
    String remove = ATM2.scanner.nextLine();
    if (remove.equalsIgnoreCase("yes")) {
        bbustomers.remove(name, balance);
        System.out.println("Your account has been removed");
        System.exit(0);

    } else {
        System.out.println("Thank you for remaining a valued customer " + name);
    }

}
    public void chooseDesire() throws Exception {
        System.out.println("What would you like to do " + name + "?");
        System.out.println("Check my balance, Withdraw Funds or Cancel (Be sure to spell correctly)");
        desire = ATM2.scanner.nextLine();

        if (desire.equalsIgnoreCase("Check my balance")){
            System.out.println("I would be happy to help you with that");
            System.out.println("Your current balance is $" + balance);

        }  else if (desire.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("I would be happy to help you with that");

//        }  else if (desire.equalsIgnoreCase("Remove my account")) {
//            System.out.println("I would be happy to help you with that");

        }  else if (desire.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
            System.exit(0);
        }
        else {
            throw new Exception("Invalid Response");
        }
    }

    public void chooseResponse() throws Exception {
        System.out.println("If you would like to withdraw money, how much money would you like to withdraw? (Example: 5.00, 10.25, 20.50, etc.) Do not use $ symbol.");
        response = ATM2.scannerDouble.nextDouble();
     if (response <= balance) {
         balance = balance - response;
         System.out.println("Please take your money below");
         System.out.println("Your balance is now: $" +balance);
         System.out.println("Have a great day");
     }else {
         throw new Exception("You do not have enough money in your account to withdraw this much");
     }

    }

    public void chooseNewresponse(){
        System.out.println("Please take your money below");
    }

}









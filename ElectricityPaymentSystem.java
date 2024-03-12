/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitypaymentsystem;

import java.util.Scanner;

class ElectricityBill {
    private double usage;
    private double costPerKWh;

    public ElectricityBill(double usage, double costPerKWh) {
        this.usage = usage;
        this.costPerKWh = costPerKWh;
    }

    public double calculateTotalCost() {
        return usage * costPerKWh;
    }
}

class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class ElectricityPaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electricity Payment System");
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Please enter your electricity usage in kWh: ");
        double usage = scanner.nextDouble();
        System.out.println("Please enter the cost per kWh: ");
        double costPerKWh = scanner.nextDouble();

        Customer customer = new Customer(name, address);
        ElectricityBill bill = new ElectricityBill(usage, costPerKWh);
        double totalCost = bill.calculateTotalCost();

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Total Electricity Bill: $" + totalCost);

        System.out.println("Thank you for using our Electricity Payment System!");
    }
}

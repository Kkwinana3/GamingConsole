/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingconsole;

/**
 *
 * @author Keamogetswe
 */
public class ConsoleApplication{
    
   
// Interface as per Question paper - must contain these 3 methods
public interface IConsole {
    String getConsoleType(); // Method to get console type (PS5, XBOX, SWITCH)
    String getStore();       // Method to get store name
    int getTotalSales();     // Method to get total sales amount
}


// Abstract class that implements IConsole interface
// Contains variables to store console device type, store name, and total amount of sales
public abstract class Console implements IConsole {
    
    // Variables to store data - private for encapsulation
    private String consoleType; // e.g., PS5, XBOX, SWITCH
    private String storeName;   // e.g., CAPE TOWN, PORT ELIZABETH, PRETORIA
    private int totalSales;     // e.g., 6000, 9000, 3800

    // Constructor that accepts console type, store name, and total amount as parameters
    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType; // Initialize console type
        this.storeName = storeName;     // Initialize store name
        this.totalSales = totalSales;   // Initialize total sales
    }

    // Method to get the console type - implements interface method
    @Override
    public String getConsoleType() {
        return consoleType; // Return console type
    }

    // Method to get store name - implements interface method
    @Override
    public String getStore() {
        return storeName; // Return store name
    }

    // Method to get total amount of sales - implements interface method
    @Override
    public int getTotalSales() {
        return totalSales; // Return total sales
    }

    // Abstract method for report - will be implemented in subclass
    public abstract void printReport();
}


// Subclass called ConsoleSales that extends the Console class
public class ConsoleSales extends Console {

   
    // Calls the parent class constructor using super
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales); // Call parent constructor
    }

    // Write code for the printReport method
    // Which prints the console type, store name, and total amount of sales
    @Override
    public void printReport() {
        System.out.println("------------------------------------------");
        System.out.println("NUMBER 1 ELECTRONICS CONSOLE SALES REPORT");
        System.out.println("------------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType()); // Get console type from parent
        System.out.println("STORE NAME: " + getStore());         // Get store from parent
        System.out.println("TOTAL SALES: " + getTotalSales());   // Get total sales from parent
        System.out.println("------------------------------------------");
    }
  }
}


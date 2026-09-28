/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author Keamogetswe
 */
import java.util.Scanner;

public class GamingConsole{

    public static void main(String[] args) {

      
        // Single dimensional array for city names 
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Single dimensional array for console types 
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array for sales data - Requirement: two-dimensional array
        
        int[][] sales = {
            {1000, 2000, 3000}, // CAPE TOWN: PS5=1000, XBOX=2000, SWITCH=3000
            {2000, 3000, 4000}, // PORT ELIZABETH: PS5=2000, XBOX=3000, SWITCH=4000
            {1500, 1100, 1200} // PRETORIA: PS5=1500, XBOX=1100, SWITCH=1200
        };

        // Array to store total sales for each city
        int[] cityTotals = new int[3]; // Will store 6000, 9000, 3800

        
        // Loop through each city (row)
        for (int i = 0; i < cities.length; i++) {
            int total = 0; // Reset total for each city
            // Loop through each console type (column) for that city
            for (int j = 0; j < consoles.length; j++) {
                total += sales[i][j]; // Add sales to city total
            }
            cityTotals[i] = total; // Save total - CAPE TOWN 6000, PORT ELIZABETH 9000, PRETORIA 3800
        }

      
        int maxIndex = 0; // Assume first city has most sales
        int maxSales = cityTotals[0]; // Set first total as max

        // Loop to find maximum sales
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > maxSales) { // If current city has more sales
                maxSales = cityTotals[i]; // Update max sales
                maxIndex = i; // Update index of city with most sales
            }
        }
       

        
        // This matches your Sample screenshot exactly

        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        // Print header: PS5, XBOX, SWITCH
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", "PS5", "XBOX", "SWITCH");

        // Print sales data for each city using 2D array
        for (int i = 0; i < cities.length; i++) {
            // %-20s = left aligned 20 spaces for city name
            // %-10d = left aligned 10 spaces for sales number
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        // Print total sales for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i], cityTotals[i]);
            // Output: CAPE TOWN 6000, PORT ELIZABETH 9000, PRETORIA 3800
        }

        System.out.println();
        // Print city with the most sales - PORT ELIZABETH
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);

        System.out.println("------------------------------------------------------------");
    }
}
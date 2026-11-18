/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salesreport;

import java.util.Scanner;

/**
 *
 * @author Fentsey Oliphant
 */
public class SalesReport {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Array for names
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        
        // 2D array for sales
        int[][] salesData = new int[3][3];

       
        for (int i = 0; i < productNames.length; i++) {
           
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println(); 
        }

       //Populated Arrays
        Product product = new Product(productNames, salesData);
        
        
        PrintProduct printer = new PrintProduct();

      
        printer.PrintReportHeader();
        printer.PrintTotalSales(product.GetTotalProductsSold());
        printer.PrintAverageSales(product.GetAverageProductSold());
        printer.PrintMostPopularProduct(product.GetMostPopularProduct());
        
        scanner.close();
    }
}

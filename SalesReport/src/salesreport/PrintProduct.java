/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreport;

/**
 *
 * @author Fentsey Oliphant
 */

public class PrintProduct {

    public void PrintReportHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("##########################################");
    }

    public void PrintTotalSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    public void PrintAverageSales(double average) {
        System.out.println("AVERAGE PRODUCT SALES: " + (int)average); 
    }

    public void PrintMostPopularProduct(String mostPopular) {
        System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
    }
}
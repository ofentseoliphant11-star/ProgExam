/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreport;

/**
 *
 * @author Fentsey Oliphant
 */


public class Product implements IProduct {
    
    
    private String[] productNames;  //Array for product names
    
    
    private int[][] salesData;  // 2D Array for sales
    
    private int totalSales;
    private double averageSales;
    private String mostPopularProduct;

    // Constructor for my arrays
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
        calculateStats(); // Calculate instantly
    }

    
    private void calculateStats() {
        totalSales = 0;
        int maxSales = -1;
        int mostPopularIndex = -1;

        for (int i = 0; i < salesData.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            
            totalSales += currentProductTotal;
            
        
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                mostPopularIndex = i;
            }
        }

        // Calculate average
        if (productNames.length > 0) {
            
            averageSales = (double) totalSales / productNames.length; 
            
            mostPopularProduct = productNames[mostPopularIndex];
        }
    }

    @Override
    public int GetTotalProductsSold() {
        return totalSales;
    }

    @Override
    public double GetAverageProductSold() {
        return averageSales;
    }

    @Override
    public String GetMostPopularProduct() {
        
        int maxSales = -1;
        for (int i = 0; i < productNames.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            if (productNames[i].equals(mostPopularProduct)) {
                maxSales = currentProductTotal;
            }
        }
        return mostPopularProduct + "(" + maxSales + ")";
    }
}
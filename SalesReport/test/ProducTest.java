
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import salesreport.Product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author Fentsey Oliphant
 */
public class ProducTest {
    
 

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] names = {"A", "B", "C"};
        int[][] sales = {
            {10, 10, 10}, // 30
            {20, 20, 20}, // 60
            {5, 5, 5}     // 15
        };
    
        Product product = new Product(names, sales);

        // Act
        int actualTotal = product.GetTotalProductsSold();

        // Assert
        assertEquals(105, actualTotal);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] names = {"A", "B"};
        int[][] sales = {
            {10, 10, 10}, // 30
            {30, 30, 30}  // 90
        };
        
        Product product = new Product(names, sales);

        // Act
        double actualAverage = product.GetAverageProductSold();

        // Assert
        // Note: Assuming your Product class calculates average as (Total Sales / Number of Products) = 120 / 2 = 60
        assertEquals(60.0, actualAverage, 0.01); 
    }
}
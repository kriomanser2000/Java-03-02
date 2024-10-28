import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProductPriceManager
{
    public static void main(String args[])
    {
        TreeMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Milk", 10.50);
        productPrices.put("Cheese", 8.2);
        productPrices.put("Sauce", 12.0);
        productPrices.put("Water", 9.3);
        productPrices.put("Grapes", 15.5);
        System.out.println("Products are sorted by name: ");
        for(Map.Entry<String, Double> entry : productPrices.entrySet())
        {
            System.out.println("Product: " + entry.getKey() + " Price: " + entry.getValue());
        }
        String highestPriceProduct = null;
        double maxPrice = Double.MIN_VALUE;
        for(Map.Entry<String, Double> entry : productPrices.entrySet())
        {
            if(entry.getValue() > maxPrice)
            {
                maxPrice = entry.getValue();
                highestPriceProduct = entry.getKey();
            }
        }
        System.out.println("\nHighest product price: ");
        if(highestPriceProduct != null)
        {
            System.out.println("Product: " + highestPriceProduct + " Price: " + maxPrice);
        }
    }
}

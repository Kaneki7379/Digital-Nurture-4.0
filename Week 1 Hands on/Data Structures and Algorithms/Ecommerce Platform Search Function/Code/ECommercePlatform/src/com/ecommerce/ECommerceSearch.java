package com.ecommerce;
import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Apparel"),
                new Product(3, "Watch", "Accessories"),
                new Product(4, "Book", "Stationery")
        };

        // Linear Search
        Product linearResult = linearSearch(products, "Shoes");
        System.out.println("Linear Search: " + linearResult);

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        // Binary Search
        Product binaryResult = binarySearch(products, "Shoes");
        System.out.println("Binary Search: " + binaryResult);
    }

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}

package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.util.Arrays;
import java.util.Comparator;

public class ProductMgmtApp {
    public static void main(String[] args) {
        Product[] products = {
                new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55),
                new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09),
                new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99)
        };

        Arrays.sort(products, Comparator.comparing(Product::getName));
        //  System.out.println(Arrays.toString(products));

        //print as JSON file
        System.out.print("JSON:");
        System.out.print("\n----------------------");
        System.out.print("\n[");
        for (Product product: products){
            System.out.printf(product.toString());
            System.out.print(",");
        }
        System.out.print("\n]");
        System.out.print("\n \n");

        //print as XML file
        System.out.print("\nXML:");
        System.out.print("\n----------------------");
        System.out.print("\n<?xml version='1.0'?>");
        System.out.print("\n<projects>");
        for (Product product: products){
            System.out.printf(product.toXML());
        }
        System.out.print("\n</projects>");
        System.out.print("\n \n");

        //print as CSV file
        System.out.print("\nCSV:");
        System.out.print("\n----------------------");
        for (Product product: products){
            System.out.printf(product.toCSV());
        }
        System.out.print("\n \n");

        //print as YAML file
        System.out.print("\nYAML:");
        System.out.print("\n----------------------");
        System.out.print("\nprojects:");
        System.out.print("\n    project:");
        for (Product product: products){
            System.out.printf(product.toYAML());
        }
    }
}

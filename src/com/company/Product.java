package com.company;
import java.util.*;


/*requirements:
each product has a picture, title and price.
 */

public class Product {
    //picture
    public String picture;
    //title
    public String title;
    //price
    public double price;

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void projectInventory() {
/*
        HashMap < String, Integer> ProductInventory = new HashMap < String, Integer>();
        ProductInventory.put("milk",0);
        ProductInventory.put("bread",0);
        ProductInventory.put("rice",0);
        ProductInventory.put("sweet",1);

        System.out.println(ProductInventory.get("sweet")+1);
        System.out.println(ProductInventory.get("sweet"));

        System.out.println(ProductInventory.containsKey("meat"));

        System.out.println("number of milk");

        Scanner milkno = new Scanner(System.in);
        milkno.nextInt();

        System.out.println("number of bread");


        Scanner breadno = new Scanner(System.in);
        breadno.nextInt();

        System.out.println("number of rice");

        Scanner riceno = new Scanner(System.in);
        riceno.nextInt();

        System.out.println("number of sweet");

        Scanner sweetno = new Scanner(System.in);
        sweetno.nextInt();
*/
        //dca

        String ProductBrandunsorted = "dca";

        char[] ProductBrandsorted = ProductBrandunsorted.toCharArray();

        Arrays.sort(ProductBrandsorted);
        System.out.println(ProductBrandsorted);


        String[] proBrandsSorted = {"bi", "apple", "free"};


        Arrays.sort(proBrandsSorted);
        //loop
        for (String name : proBrandsSorted) {
            System.out.println(name);

        }
    }

    public static void main( String [] args ){

        projectInventory();

    }
}



/*
5!= 4!*1
5!= 4*3!*1
5!= 4*3*2!*1
5!= 4*3*2*1!

base case
or 0!=1
 */
package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
	    // Customer info

        String number="4159872312";
        System.out.println(number);

        String name="Joe";
        System.out.println(name);

        //Prompt msg
        System.out.println("Enter 1 for breakfast. Enter 2 for lunch. Enter 3 for dinner.3");

        //taking choice from the user
        Scanner choice = new Scanner(System.in);
        int  choiceNum= choice.nextInt();

        //unit price for each one
        int mmilkPrice=3;
        int eggPrice=1;
        int meatPrice= 3;
        int ricePrice=1;
        int noodlesPrice =3;
        int totalCost =0;

        //Menu

        /*if
        if (choiceNum==1){
        System.out.println("For breakfast: milk,egg");}
        if (choiceNum==2) {
        System.out.println("For lunch: meat,rice");}
        if (choiceNum==3) {
        System.out.println("For dinner: noodles"); } */

        //if else
        if (choiceNum==1){
            System.out.println("For breakfast: milk,egg");}
        else if (choiceNum==2) {
            System.out.println("For lunch: meat,rice");}
        else {
            System.out.println("For dinner: noodles"); }

        //switch
       /* switch (choiceNum) {
            case 1: System.out.println("For breakfast: milk,egg");
            break;
            case 2: System.out.println("For breakfast: milk,egg");
            break;
            default: System.out.println("For breakfast: milk,egg");
        } */


        //total price

        for (int i =0; i<10; i++){
            //totalCost = totalCost + mmilkPrice + eggPrice;
            totalCost +=  mmilkPrice + eggPrice;
        }

        for ( int i =0; i<10; i++){
            totalCost += meatPrice + ricePrice;
        }

        for ( int i = 0; i < 10; i++){
            totalCost += noodlesPrice;
        }

        System.out.println(totalCost);
    }

    public int addPrice( int milkPrice, int eggPrice){

        int totalCost =0;
        for (int i =0; i<10; i++){
            //totalCost = totalCost + mmilkPrice + eggPrice;
            totalCost +=  milkPrice + eggPrice;
        }
        return totalCost;
    }


}

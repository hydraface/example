package com.company;
import java.util.*;
public class Department {
    String departmentName;
    int productCount;


    public static void searchDep (String[] depName, String dep){

        //Answer: looping/iteration without extra space
        for (int i= 0; i<depName.length; i++) {
            if (dep==depName[i]) {
                System.out.print(i);
            }
        }

    }

    //main
    public static void main(String []str){

        String[] depNames ={"Food", "Clothes", "Books"};

        //calling arguments
        searchDep(depNames,depNames[2]);

    }

}

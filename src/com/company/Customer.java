package com.company;

import java.util.*;

/*requirements:
each customer has a name, age and phone number.
 */
public class Customer {

    //name
    String [] name;
    //age
    int age;
    //phone#
    String phone;

    //set (to give value)
    //name = ["chun", "ami", "hfg"];
    public static void setName() {
        String [] name = {"abn", "bcx", "akj"};
       // int [] num = {5,1, 2, 3, 8, 2, 4} ;

      //Arrays.sort();
        Arrays.sort(name);

      for (String n : name){
         System.out.println(n);
      }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //get (to return value)




    public int getAge() {
        return age;
    }

    public String getPhone(){return phone;}

        public static void Main ( String [] args){

        }


        public static void main (String[] args)  {

        setName();

        }
}


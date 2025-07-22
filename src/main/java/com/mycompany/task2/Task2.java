

package com.mycompany.task2;

import java.util.*;
class cal{
    double a;
    double b;
    cal(){
         System.out.println("Welcome to the Calculator");
         displaymenu();
         
         
}   
      public void displaymenu(){
          
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("1. Addition(+)");
        System.out.println("2. Substraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        System.out.println("5. EXIT");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                addition();
                break;
                
            case 2:
                substraction();
                break;
                
            case 3:
                multiplication();
                break;
                
            case 4: 
                division();
                break;
                
            case 5:
                System.out.println("Thank you for using the calculator!");
                break;
                
            default:
                System.out.println("Invalid input, Try Again");
                
                
        }
        
        
    }
    public void addition(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        b = sc.nextDouble();
        double s = a+b;
    
        
        System.out.println("The addition of these two numbers is: "+ s);
        displaymenu();
        
    }
     public void substraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        b = sc.nextDouble();
        
       double s = a-b;
    
        
        System.out.println("The substraction of these two numbers is: "+ s);
         displaymenu();
    }
      public void multiplication(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        b = sc.nextDouble();
        
        double s = a*b;
    
        
        System.out.println("The multiplication of these two numbers is: "+ s);
         displaymenu();
    }
       public void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        b = sc.nextDouble();
        
        double s = a/b;
    
        
        System.out.println("The division of these two numbers is: "+ s);
         displaymenu();
    }
        
}

public class Task2 {

    public static void main(String[] args) {
      cal obj = new cal();
     
       
    }
}

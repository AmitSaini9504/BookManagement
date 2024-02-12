/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;

/**
 *
 * @author Asus
 */
public class ConsOverLoading {
    
    ConsOverLoading(){
        System.out.println("This is over Default Constructor");
    }
    
    ConsOverLoading(String First)
    {
        System.out.println("This is 01  "+ First+ "  Parametrized Constructor");
    }
    
     ConsOverLoading(char xyz)
     {
         System.out.println("this is our " + xyz +" parameterize Constructor");
     }
      ConsOverLoading(String First,int val)
      {
          System.out.println("This is our "+" "+First+val);
      }
      
      void display()
      {
          System.out.println("The stock of Item is available");
      }
      
      public static void main(String[] args) {
        
           ConsOverLoading con1 = new  ConsOverLoading();
            ConsOverLoading con2 = new   ConsOverLoading("First");
             ConsOverLoading con3 = new  ConsOverLoading("Second");
             ConsOverLoading con4 = new  ConsOverLoading('A');
             
             con1.display();
             System.out.println("Hello");
             
    }
      
      
    
    
    
}

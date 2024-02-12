/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;

abstract class AnnoyClass
{
    abstract void display();
    
    public static void main(String[] args)
    
    {
     AnnoyClass at = new AnnoyClass()
     {
         void display()
         {
             System.out.println("Hello");
         }
     };
     
     
     
     at.display();
    }
}
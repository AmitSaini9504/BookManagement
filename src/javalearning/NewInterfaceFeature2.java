/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;

interface test1
{
    static void show()
    {
        System.out.println("Hello");
    }
}

interface test2
{
     static void show1()
    {
        System.out.println("Hiii");
    }
}

  

/**
 *
 * @author Asus
 */
public class NewInterfaceFeature2 implements test1, test2
        
{
    public static void main(String[] args) {
        
        test1.show();
        test2.show1();
        
       
        
        
        
        
        
    }
 
    
}

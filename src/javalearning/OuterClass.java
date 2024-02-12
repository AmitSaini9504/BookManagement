/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;

/**
 *
 * @author Asus
 */


//Nested class - when two classes are made in a single class known by Nested Class 
public class OuterClass {
    
    class InnerClass{
        
        
        //method
        void Show()
        {
            System.out.println("Hello this is inner class");
        }
        
    }
    
    void Show()
    {
        System.out.println("Hello this is outer class");
    }
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.Show();
        
        OuterClass.InnerClass nc = new OuterClass().new InnerClass();
        nc.Show();
        System.out.println("Hello This is main method");
    }
    
}

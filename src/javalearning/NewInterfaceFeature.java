/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;

interface space
{
    public abstract void show();
    
    default void display()
    {
        System.out.println("Hello this is default method testing ");
    }
    //java 8
    
    static void publish(space s)
    {
        System.out.println("Hello this is static method testing");
        s.view();
        
    }
    
    //java9
    
    private void view()
    {
        System.out.println("This is private method testing");
    }
}

/**
 *
 * @author Asus
 */
public class NewInterfaceFeature {
    
    public static void main(String[] args) {
        
    
    
    space s1 = new space() 
    {
      public void show()
      {
          System.out.println("Hello");
      }
    };
       s1.show();
       s1.display();
       space.publish(s1);
       
       //private dosen't exist outdide of the body
       
       
       
  
       
       //sataic method alwasy called by interface name
    }
}

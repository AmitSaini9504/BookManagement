/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning;
public class LocalInnerClass {
    
    //Global Variable
    String city = "Jaipur";
    
    void ShowCity()
    {
        String Place = "Aamer";
        System.out.println(this.city + " "+Place);
        
        class Local
        {
            void ticket()
            {
                System.out.println("Got it....");
            }
            
            
        }
        
        Local LT = new Local();
        LT.ticket();
    }
    
    public static void main(String[] args) {
        
        LocalInnerClass LI = new LocalInnerClass();
        LI.ShowCity();
        
       
        
        
        System.out.println("Hello this is main method");
    }
    
}

package javalearning;
public  abstract class AbstractTest 
{
    //we can leave some or more method body for future development
    
   
   void add()
   {
       System.out.println("Addition");
   }
   //Abstract keyword allows to leave function for child classif they wants to access 
       abstract void substract();
       abstract void multiplication();
}
     class ChildClass extends AbstractTest
     {

         void substract(){
             System.out.println("Substract");
         }
         //declare object or print
         void multiplication()
         {
             System.out.println("Multi");
         }
         public static void main(String[] args) {
            
         
         ChildClass cc = new ChildClass();
             System.out.println("Hello");
         cc.add();
         
         
     }
   
    
    
 
     }


//Assignment 2 Problem 2nd " Write a program to print all alphabet in reverse order using do while loop.
package JavaLearning;
  public class Alphabets{
    
    public static void main(String[] args) {
          System.out.println("Alphabets in sequance: ");
             for(char ch = 'A'; ch <='Z';ch++){
                System.out.print(ch+" ");
            }
             System.out.println(" ");
//-----------------------------------------------------------------------------
            
            //Alphabets in Reverse
            
            System.out.println("Alphabets in reverse order : ");
                for(char ch = 'Z';ch>='A';ch--){
                    System.out.print(ch+" ");
                }
 //----------------------------------------------------------------------------
                //Using Do while Loop
                char ch1 = 'Z';
                System.out.println("Using do whlile loop : ");
                
                do{
                    System.out.print(ch1+ " ");
                    ch1--;
                }
                while(ch1 >='A');
                
                System.out.println("Checking done.....");
    }
}
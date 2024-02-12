
package javalearning;

public class ExeptionTest {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        
        try{
            
       int c = a/b;
       
        }
        
        
        //Exception
        //ArithmeticException
        //RunTimeException
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array");   
        }
        System.out.println("Amit");
    }
}

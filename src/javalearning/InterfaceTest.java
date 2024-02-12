package javalearning;

interface Check
    {
        
        void show();
    }
public class InterfaceTest {
    
    public static void main(String[] args) {
        
        Check c1 = new Check()
        {
         public  void show()
          {
              System.out.println("Hello");
          }
        };
    }
    
    
}

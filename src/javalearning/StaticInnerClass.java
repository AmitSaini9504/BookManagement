package javalearning;
public class StaticInnerClass
{
    
    
    //no need to create object in static case
    
    static int RollNo = 123;
    
    static void display()
    {
        System.out.println("Java is everywhere");
    }
    
    static class StaticTest
    {
        static void show()
        {
            System.out.println("This is our Java Programming class");
        }
        
        void CountryName()
        {
            System.out.println("India");
        }
        
    }
    
    public static void main(String[] args)
    {
        System.out.println(StaticInnerClass.RollNo);
        StaticInnerClass.display();
        
        StaticInnerClass.StaticTest.show();
        
        //Also possible object creation in static case
        StaticInnerClass.StaticTest st = new StaticInnerClass.StaticTest();
        st.CountryName();
          
    }
    
    
}

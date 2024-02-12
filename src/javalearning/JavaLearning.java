package javalearning;


import CoreJava.Child;

public class JavaLearning extends Parent {
    public static void main(String[] args) {
        
       
     /* Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter a Word : ");
        
        String word = sc.nextLine();
        
        System.out.println("Word before replace character: "+word);
        
        String newWord = word.replace("a","e");
        
        System.out.println("Word after replace character : "+newWord);
     */
        System.out.println("This is main class");
     Parent p1 = new Parent();
      //  System.out.println(p1.key);
        
        Child ch1 = new Child();
        System.out.println(ch1.lock);
        
        //System.out.println(p1.PrimaryKey);
        //System.out.println(ch1.primarylock);
       // System.out.println(p1.privatekey);
       
        //System.out.println(p1.protectedkey);
    
      //  JavaLearning JL = new JavaLearning();
        //System.out.println(JL.key);
        

        System.out.println(p1.showme(p1));
        
    }
        
     
    }
    
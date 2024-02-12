
package javalearning;

public class Parent {
    public int key=11;
    public int PrimaryKey = 13;
    private int privatekey =15;
    protected int protectedkey = 16;
    private int add(){
          return key+PrimaryKey;
    }
            public int  showme(Parent p){
               int add = p.add();
               return add;
            }
           
}


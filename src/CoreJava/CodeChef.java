/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.util.*;

class Codechef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Input string
        scanner.close();

        if (s.length() > 7) {
            
            // correct the indexing from one based to zero based
            char c1 = s.charAt(1); 
            char c2 = s.charAt(4);
            char c3 = s.charAt(6);

            System.out.println(c1 + c2 + c3);
        } else {
            // Handle the case when indices are out of bounds
            System.out.println("Invalid indices"); 
        }
    }
}
    


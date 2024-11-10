/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import java.util.Scanner;

/**
 *
 * @author Ahmad hazrati
 */
public class JavaApplication65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        System.out.println("pleas Enter first digit :"+x+y );
        int a = input.nextInt();
        System.out.println("pleas Enter 2nd digit :");
        int b = input.nextInt();

        if (a == x && b == y) {
            System.out.println("Congratuletion You win $10000 ");}
        else if(a==y&& b==x){
                System.out.println("Good you win $3000");}
         else if(a==x  || b==y) 
            System.out.println("Not bad you win $1000");
        else
             System.out.println("This digit isn't found");
        // TODO code application logic here
    }
    
}

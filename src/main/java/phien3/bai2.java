/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien3;
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class bai2 {
    public static void main (String[] args){
    double i,m;
    Scanner input = new Scanner(System.in);
     System.out.println("Enter a value for inch");
     i =input.nextDouble();
     m= i/39.37;
     System.out.println("Value in meter is:%3f\n" + m);
    }
}

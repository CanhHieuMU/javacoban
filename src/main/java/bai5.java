/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number: ");                                    
        double x = scanner.nextDouble();                                                          
        System.out.print("Input floating-point another number: ");
        double y = scanner.nextDouble();
        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y){
            System.out.println("They are the same up to three decimal places");
        }
        else{
            System.out.println("They are different");
        }
    }
}
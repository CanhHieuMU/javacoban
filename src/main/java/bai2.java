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
public class bai2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
	System.out.print("Input the 1st number: ");
	int num1 = scanner.nextInt();
		   
	System.out.print("Input the 2nd number: ");
	int num2 = scanner.nextInt();
		   
	System.out.print("Input the 3rd number: ");
	int num3 = scanner.nextInt();
		   	   
	if (num1 > num2)
	if (num1 > num3)
	System.out.println("The greatest: " + num1);
		   
            if (num2 > num1)
            if (num2 > num3)
            System.out.println("The greatest: " + num2);
		   
                if (num3 > num1)
                if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
}

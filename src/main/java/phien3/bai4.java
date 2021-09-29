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
public class bai4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x,y,z,c;
        System.out.println("Input the number of minutes:");
        x=input.nextInt();
        c=x;
        y=x/525949;
        x=x%525949;
        z=x/1440;
        System.out.println(c+ "minutes is approximately "+y+" year and "+z+" day");
    }
}

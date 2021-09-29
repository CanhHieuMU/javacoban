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
public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float timeSeconds;
        float ms,kh,mh;
        System.out.print("Input distance in meters: ");
        float distance = input.nextFloat();
        System.out.print("Input hour: ");
        float h = input.nextFloat();
        System.out.print("Input minutes: ");
        float m = input.nextFloat();
        System.out.print("Input seconds: ");
        float s = input.nextFloat();
        timeSeconds = (h*3600) + (m*60) + s;
        ms = distance / timeSeconds;
        kh = (distance/1000.0f) / (timeSeconds/3600.f);
        mh = kh / 1.609f;
        System.out.println("Your speed in meters/second is "+ms);
        System.out.println("Your speed in km/h is "+kh);
        System.out.println("Your speed in miles/h is "+mh);
        input.close();
    }   
}
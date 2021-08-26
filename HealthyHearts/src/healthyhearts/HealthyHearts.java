/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthyhearts;
import java.util.Scanner;
/**
 *
 * @author n8thegr8
 */
public class HealthyHearts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        double maximum = 220 - age;
        System.out.println("Your maximum heart rate is " + (int)maximum);
        long rangemin = Math.round(maximum * 0.5);
        long rangemax = Math.round(maximum * 0.85);
        
        System.out.println("Your target heart rate range is between " + rangemin + " and " + rangemax);
        
    }
    
}

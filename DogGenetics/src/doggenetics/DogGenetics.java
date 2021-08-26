/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doggenetics;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author n8thegr8
 */
public class DogGenetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the name of your dog: ");
       String name = input.nextLine();
       System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
       Random gen = new Random();
       System.out.println(name + " is: ");
       int first = 0,second = 0 ,third = 0,fourth = 0,fifth = 0;
    
       
       first = gen.nextInt(100) + 1;
       if((100 - first) > 0)                //nextInt can't accept zero
           second = gen.nextInt(100 - first) + 1;
       
       if((100 - first - second) > 0)
           third = gen.nextInt(100 - first - second) + 1;
       
       if((100 - first - second - third) > 0)
           fourth = gen.nextInt(100 - first - second - third) + 1;
       
       fifth = 100 - first - second - third - fourth;
       
       System.out.println(first + "%" + " St. Bernard");
       System.out.println(second + "%" + " Chihuahua");
       System.out.println(third + "%" + " Dramatic RedNosed Asian Pug");
       System.out.println(fourth + "%" + " Common Cur");
       System.out.println(fifth + "%" + " King Doberman");
       
        
        
        
        
    }
    
}

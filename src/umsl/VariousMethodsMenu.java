/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.io.IOException;
import java.util.*;
        
/**
 *
 * @author owner
 */
public class VariousMethodsMenu 
{
    public static void main(String args[]) throws IOException
    {
        VariousMethods vm = new VariousMethods();
        int input = 0;
        
        do
        {
            System.out.println("1) Product");
            System.out.println("2) Find Twelve");
            System.out.println("3) Min Max Average");
            System.out.println("4) Grades");
            System.out.println("5) Exit");
            Scanner sc = new Scanner(System.in);
            
            input = sc.nextInt();
            
            if(input == 1)
            {
                vm.product();
            }
           
            if(input == 2)
            {
                vm.findTwelves();
            }
            
            if(input == 3)
            {
                vm.minMaxAvg();
            }
            
            if(input == 4)
            {
                vm.myGrader();
            }
            
        }while(input !=5);
        
    }
    
}

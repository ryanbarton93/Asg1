package umsl;

import static com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary.sumF;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class VariousMethods 
{

    public void product() throws IOException
    {
          //Variables
        float input; //User Inputs
        float tony=1; //Temporary Number Holder
        double total; //Total after Multiplication
        String erbell; //Token String
        
        //Prompt
        System.out.println("Enter a string of positive numbers. (Negatives will be ignored); 0 to exit");
        System.out.println("");
        
        //Start BufferedReader
        BufferedReader bobby;
        bobby = new BufferedReader(new InputStreamReader(System.in));
        String line = bobby.readLine();
        
        //Start StringTokenizer
        StringTokenizer token = new StringTokenizer(line);
        input = Float.valueOf(token.nextToken());
        
        //Multiplier Code
        if(input==0)
        {
            System.out.print("Exiting");
            System.exit(0);
        }
        while(input!=0)
        {
            if(input>0)
            {
                tony = input * tony;
            }
            else if(input<0)
            {
                System.out.println(input + "is ignored.");
            }
        input = Float.valueOf(token.nextToken());
        }
        
        //Output
        erbell = Float.toString(tony);
        total = Double.parseDouble(erbell);
        System.out.println("Your total is " + total);
        
    }
    
    public void findTwelves() throws IOException
    {
     	 //Variables
        int input=0; //User inputs 
        int first=0; //First index instance of 12
        int last=0; //Last index instance of 12
        int counter=0; //Count index
        int twelves=0; //Number of 12s
        
        //Message Prompt
        System.out.println("Enter a string of whole numbers.");
        System.out.println("This app will tell you the first and last instance of 12 a.\nIt also tells you the sequence.");
        
        //Start Buffered Reader br;
        BufferedReader buffy;
        buffy = new BufferedReader(new InputStreamReader(System.in));
        String line = buffy.readLine();
        
        //Start StringTokenizer
        StringTokenizer token = new StringTokenizer(line);
        
        //Stuff Doer 
        while(token.hasMoreTokens())
        {
               input = Integer.parseInt(token.nextToken());
               counter++;
               
               if(first==0)
               {
                    if(input== 12)
                    {
                        first = counter;
                        last = counter;
                        twelves++;    
                    }
                    
               }
               else
               {
                   if(input==12)
                   {
                       twelves++;
                       last = counter;
                   }
               
               }
        }
        if(first!=0)
        {
            System.out.println("The first instance of 12 is located at index " + first);
            System.out.println("The last instance of 12 is located at index " + last);
            System.out.println("You entered 12 " + twelves + " times");
        }
        else 
        {
        System.out.println("The first instance of 12 is located at index " + first);
        }
    }
    
    public void minMaxAvg() throws IOException
    {
        float input=0; //Inputs
        float min=0; //Minimum Number
        float max=0; //Maximum Number
        float total=0; //Total
        float count=0; //Count
        float tony=0; //Temporary

        
        //Prompt
        System.out.println("Enter a string of numbers");
        
        //Start BufferedReader
        BufferedReader bobby;
        bobby = new BufferedReader(new InputStreamReader(System.in));
        String line = bobby.readLine();
        
        //Start Tokenizer
        StringTokenizer token = new StringTokenizer(line);
        tony = Float.parseFloat(token.nextToken());
        min = tony;
        
        if(tony>max)
        {
            max=tony;
        }
            count++;
            total = tony + total;
        //While Loop     
            while(token.hasMoreTokens())
            {
                input = Float.valueOf(token.nextToken());
                if(input<min)
                {
                    min=input;
                }
                if(input>max)
                {
                 max=input;   
                }    
                    count++;
                    total = input + total;
                    
            }
         //Output
        float avg = total/count;        
        System.out.println("Minimum value: " + min + "\nMaximum value: " + max + "\nAverage is: " + avg);                                      
    
    }
    
    public void myGrader()
    {
        System.out.println("Please enter a series of numbers:");
        Scanner sc = new Scanner(System.in);
        
        //String myline = br.readLine();
        StringTokenizer mytokenizer = new StringTokenizer(sc.nextLine());
        int input=0;
        
        while(mytokenizer.hasMoreTokens())
        {
            String temp;
            temp = mytokenizer.nextToken();
            
            if(temp.equalsIgnoreCase("55"))
            {
               System.out.println(temp);
            }
           //Scanner sc = new Scanner(System.in);
	input = sc.nextInt();

	if(input==-99) System.exit(1);
            int sumA = 0;
            int sumB = 0;
            int sumC = 0;
            int sumD = 0;
            int sumF = 0;

	while(input != -99){

            if(input>=90){
                sumA++;
                System.out.println(input + "      A");
	    }
            else if(input >= 70){
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50){
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35){
                sumD++;
                System.out.println(input + "      D");
            }
            else{
                sumF++;
                System.out.println(input + "      F");
            }

            input = sc.nextInt();
        }
        
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
   } 
}

        } 

   


    
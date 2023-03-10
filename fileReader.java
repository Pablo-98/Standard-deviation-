

import java.io.*;

import java.util.Scanner;


public class fileReader{

    public static void main(String[] args)  throws IOException {
        
        //File number = new File ("numbers.txt");
        Scanner numReader = new Scanner(new File("numbers.txt"));


double n = 0; // total numbers in text file
double sum = 0;
double mean;

double accumulator = 0; // represents that weird symbol.. But its purpose is to accumulate the various values of pow...

double sub;
double pow; // holds the value of sub squared 
double sigma;
double frac;
double stdev;

//part 4
double largest = 0; 
double smallest = 1;


      while(numReader.hasNext()){
        double currentNum = numReader.nextDouble();
        
        
        // what is the data type that you expect in each line: I expect integers.
        System.out.println(currentNum);
        n++;
     sum = sum + currentNum;
      } 


      System.out.println();
      mean = sum/n;
      numReader = new Scanner(new File("numbers.txt"));

      while(numReader.hasNext()) {
        double currentNum2 = numReader.nextDouble();
        sub = currentNum2 - mean;

        pow = Math.pow(sub, 2);
     accumulator += pow;




      }
      frac = accumulator / (n -1);

      stdev = Math.sqrt(frac);

      

      numReader = new Scanner(new File("numbers.txt"));

      while(numReader.hasNext()){
       double current = numReader.nextDouble();

        if( current > largest) {
            largest = current;
        } else if (current < smallest) {
            smallest = current;
        }

      }

      



      

      System.out.println();
      System.out.println("largest: " + largest);
      System.out.println();
      System.out.println("smallest: " + smallest );
      System.out.println();
      System.out.println("mean: " + mean);
      System.out.println();
      System.out.println("standard deviation: " + stdev);





        




    }
}
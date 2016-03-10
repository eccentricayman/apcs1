/*
  Team Winter  -- Ayman Ahmed, Andy Liang, Aleksandar Shipetich
  APCS2 pd5
  HW#11 -- <BLANK>
  2016-03-09
*/

/*======================================
  class MergeSortTester

  ALGORITHM:
  Recursively split the array until it is split into arrays of length 1, and then go
  back up the chain and merge the one arrays together until you have your sorted array
  back.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  We classified it as O(n*log(n)).

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

import java.util.Scanner;

public class MergeSortTester {

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    
    //helper to randomly fill array
    public static int[] randArr(int n) {
        int[] arr = new int[n];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        return arr;
    }

    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i : a )
            System.out.print( i + ",");
        System.out.println("]");
    }
 
    
    //returns how long an array takes to mergesort in seconds
    public static void timeTest(int n) {
        int[] arr = randArr(n);
        System.out.println("Unsorted Array of length " + n);
        printArray(arr);
        long start = System.nanoTime();
        MergeSort.sort(arr);
        long end = System.nanoTime();
        System.out.println("Sorted Array");
        printArray(arr);
        System.out.println("Time: " + (end - start) + " nanoseconds");
    }
    
    public static void main( String[] args ) {
        //keep testing until user Ctrl + C's
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an array length to test or Ctrl + C to stop: ");
            int n = sc.nextInt();
            timeTest(n);
        }
    }//end main
    
}//end class

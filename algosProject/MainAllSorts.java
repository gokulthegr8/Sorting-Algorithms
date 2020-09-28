package algosProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainAllSorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1-Insertion Sort, 2-Merge Sort, 3-Heap Sort, 4-In Place Quick Sort, 5-Modified Quick Sort");
		System.out.println("Enter a number between 1 to 5 based on the Sorting Algorithm ");
		Scanner input=new Scanner(System.in);
		int sort=input.nextInt();
		switch (sort) { 
        case 1: 
        	InsertionSort(); 
            break; 
        case 2: 
        	MergeSort();
            break; 
        case 3: 
        	HeapSort(); 
            break; 
        case 4: 
        	InPlaceQuickSort(); 
            break; 
        case 5: 
        	ModifiedQuickSort(); 
            break; 
        
        default: 
            System.out.println("Please enter a number between 1 to 5"); 
        } 
	}
	static void InsertionSort(){
		InsertionSort is=new InsertionSort();
		ReverseArray ra=new ReverseArray();
		PrintArray pa=new PrintArray();
		System.out.println("Enter the number of numbers to be sorted: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long start = System.nanoTime();
		int ar[]= new int[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < ar.length; ++i){
            ar[i] = randomGenerator.nextInt(9999);
        }
        
		is.insertionSort(ar);
	    long end = System.nanoTime();

		System.out.println("Sorted array is: "+Arrays.toString(ar));		
	    System.out.println("Time taken to sort the array is: "+(end - start)/1000000000.0 + " s");
	
	    start = System.nanoTime();
	    is.insertionSort(ar);
	    end = System.nanoTime();

		System.out.println("Sorted array for best case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the already sorted array is: "+(end - start)/1000000000.0 + " s");

	    ra.Reverse(ar, 0,ar.length-1);
		System.out.println("Reverse Array is: "+Arrays.toString(ar));
	    start = System.nanoTime();
	    is.insertionSort(ar);
	    end = System.nanoTime();
	    
		System.out.println("Sorted array for worst case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for worst case scenario is: "+(end - start)/1000000000.0 + " s");

	}
	static void MergeSort() {
		MergeSort ms=new MergeSort();
		ReverseArray ra=new ReverseArray();
		System.out.println("Enter the number of numbers to be sorted: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long start = System.nanoTime();
		int ar[]= new int[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < ar.length; ++i){
            ar[i] = randomGenerator.nextInt(9999);
        }
        ms.sort(ar, 0, ar.length-1);
	    long end = System.nanoTime();

		System.out.println("Sorted array is: "+Arrays.toString(ar));		
	    
	    System.out.println("Time taken to sort the array is: "+(end - start)/1000000000.0 + " s");
	
	    start = System.nanoTime();
        ms.sort(ar, 0, ar.length-1);
	    end = System.nanoTime();

		System.out.println("Sorted array for best case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for best case scenario is: "+(end - start)/1000000000.0 + " s");
	    ra.Reverse(ar, 0,ar.length-1);
		System.out.println("Reverse Array is: "+Arrays.toString(ar));
	    start = System.nanoTime();
        ms.sort(ar, 0, ar.length-1); 
	    end = System.nanoTime();

		System.out.println("Sorted array for worst case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for worst case scenario is: "+(end - start)/1000000000.0 + " s");

	}
	static void HeapSort() {
		HeapSort hs=new HeapSort();
		ReverseArray ra=new ReverseArray();
		System.out.println("Enter the number of numbers to be sorted: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long start = System.nanoTime();
		int ar[]= new int[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < ar.length; ++i){
            ar[i] = randomGenerator.nextInt(9999);
        }
        
		hs.sort(ar);
	    long end = System.nanoTime();

		System.out.println("Sorted array is: "+Arrays.toString(ar));		
	
	    
	    System.out.println("Time taken to sort the array is: "+(end - start)/1000000000.0 + " s");
	
	    start = System.nanoTime();
	    hs.sort(ar);
	    end = System.nanoTime();
		System.out.println("Sorted array for best case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the already sorted array is: "+(end - start)/1000000000.0 + " s");

	    ra.Reverse(ar, 0,ar.length-1);
		System.out.println("Reverse Array is: "+Arrays.toString(ar));
	    start = System.nanoTime();
	    hs.sort(ar);
	    end = System.nanoTime();

		System.out.println("Sorted array for worst case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for worst case scenario is: "+(end - start)/1000000000.0 + " s");

	}
	static void InPlaceQuickSort() {
		InPlace_QuickSort qs=new InPlace_QuickSort();
		ReverseArray ra=new ReverseArray();
		System.out.println("Enter the number of numbers to be sorted: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long start = System.nanoTime();
		int ar[]= new int[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < ar.length; ++i){
            ar[i] = randomGenerator.nextInt(9999);
        }
        qs.sort(ar, 0, ar.length-1);
	    long end = System.nanoTime();

		System.out.println("Sorted array is: "+Arrays.toString(ar));		
	    
	    System.out.println("Time taken to sort the array is: "+(end - start)/1000000000.0 + " s");
	
	    start = System.nanoTime();
        qs.sort(ar, 0, ar.length-1);
	    end = System.nanoTime();

		System.out.println("Sorted array for best case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for best case scenario is: "+(end - start)/1000000000.0 + " s");
	    ra.Reverse(ar, 0,ar.length-1);
		System.out.println("Reverse Array is: "+Arrays.toString(ar));
	    start = System.nanoTime();
        qs.sort(ar, 0, ar.length-1); 
	    end = System.nanoTime();

		System.out.println("Sorted array for worst case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for worst case scenario is: "+(end - start)/1000000000.0 + " s");

	}
	static void ModifiedQuickSort() {
		ModifiedQuickSort mqs=new ModifiedQuickSort();
		reverseComparable ra=new reverseComparable();
		System.out.println("Enter the number of numbers to be sorted: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long start = System.nanoTime();
		Comparable[] ar= new Comparable[n];
        Random randomGenerator = new Random();
        for (int i = 0; i < ar.length; ++i){
            ar[i] = randomGenerator.nextInt(9999);
        }
        mqs.quicksort(ar, 0, ar.length-1); 
	    long end = System.nanoTime();

		System.out.println("Sorted array is: "+Arrays.toString(ar));		
	    
	    System.out.println("Time taken to sort the array is: "+(end - start)/1000000000.0 + " s");
	
	    start = System.nanoTime();
	    mqs.quicksort(ar, 0, ar.length-1); 
	    end = System.nanoTime();

		System.out.println("Sorted array for best case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for best case scenario is: "+(end - start)/1000000000.0 + " s");
	    ra.Reverse(ar, 0,ar.length-1);
		System.out.println("Reverse Array is: "+Arrays.toString(ar));
	    start = System.nanoTime();
	    mqs.quicksort(ar, 0, ar.length-1); 
	    end = System.nanoTime();

		System.out.println("Sorted array for worst case scenario is: "+Arrays.toString(ar));
	    System.out.println("Time taken to sort the array for worst case scenario is: "+(end - start)/1000000000.0 + " s");

	}
}

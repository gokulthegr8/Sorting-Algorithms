package algosProject;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
	
	public InsertionSort(){
	
	}
	public void insertionSort(int ar[]) {
		
		for(int i=1;i<ar.length;++i)
		{
			int temp=ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>temp) {
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=temp;
		}
		
		
	}
	
}

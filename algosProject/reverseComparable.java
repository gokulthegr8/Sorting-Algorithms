package algosProject;

public class reverseComparable {
	static void Reverse(Comparable arr[], 
            int start, int end) 
{ 
Comparable temp; 
   
while (start < end) 
{ 
    temp = arr[start];  
    arr[start] = arr[end]; 
    arr[end] = temp; 
    start++; 
    end--; 
}  
}
}

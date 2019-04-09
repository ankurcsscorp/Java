

public class NextGratterElement {
	 static void nextBig(int arr[], int n) 
	    { 
	        int next; 
	        for (int i=0; i<n; i++) 
	        { 
	            next = -1; 
	            for (int j = i+1; j<n; j++) 
	            { 
	                if (arr[i] < arr[j]) 
	                { 
	                    next = arr[j]; 
	                    break; 
	                } 
	            } 
	            System.out.println(arr[i]+" -> "+next); 
	        } 
	    } 
	       
	    public static void main(String args[]) 
	    { 
	        int arr[]= {1,5,7,3,9}; 
	        int n = arr.length; 
	        NextGratterElement.nextBig (arr, n); 
	    } 
	} 

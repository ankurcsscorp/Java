public class FindTheMissingNumber

{ 
 
 
    static int missing(int arr[], int n) 
 
   { 
  
      int i, total; 
  
      total  = (n+1)*(n+2)/2;    
 
       for ( i = 0; i< n; i++) 
   
        total -= arr[i]; 
   
     return total;

    } 
       

 
    public static void main(String args[]) 

    { 
    
    int arr[] = {1,2,4,5,6}; 
 
       int miss = missing(arr,arr.length-1); 
  
     System.out.println(miss);  
  
    }
 
}
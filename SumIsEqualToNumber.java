public class SumIsEqualToNumber

{ 
   
   

static void pair(int arr[], int n, int sum)
 
{ 
    
 
   for (int i = 0; i < n; i++) 
  
      for (int j = i + 1; j < n; j++) 
    
        if (arr[i] + arr[j] == sum) 
     
           System.out.println(   arr[i] +  ", " + arr[j] );
 
} 
  
 
 

public static void main(String []arg)

 
{ 
   
 int arr[] = {2,5,4,6,8,3,1};
 
    int n = arr.length; 
 
   int sum = 6; 
  
 SumIsEqualToNumber.pair(arr, n, sum); 

} 

} 
  
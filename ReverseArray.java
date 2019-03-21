public class ReverseArray
 {
    
static void reverse(int arr[], int start, int end)
 
   {
      
  int temp;
     
  while(start < end)
   
     {
       
     temp=arr[start];
   
         arr[start]=arr[end];
        
    arr[end]=temp;
       
     start++;
      
      end--;
     
   }
 
   }
  
  static void printArray(int arr[],int size)
 
   {
     
   for(int i=0;i< size;i++)
    
    {
          
  System.out.println(arr[i]);
   
         System.out.println();
 
       }
   
 }
  
  public static void main(String[] args)
 
   {
        
int arr[]={1,2,3,4,5,6};
   
     printArray(arr,arr.length);
   
     reverse(arr,0,arr.length-1);
  
      System.out.println("After reversing the array");
    
    printArray(arr,arr.length);
  
  }
  
   
   }
    
   
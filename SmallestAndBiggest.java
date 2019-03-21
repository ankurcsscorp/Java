public class SmallestAndBiggest

{
  
   static void smallest(int arr[])
  
  {
    
   int small=arr[0];
   
     for(int i=0;i<arr.length;i++)
  
      {
     
      if(arr[i]< small)
    
       {
          
     small=arr[i];
  
         }
         
   
        }
    
    System.out.println("The smallest number is : "+small);
 
   }
     
 static void biggest(int arr[])
   
 {
      
  int big=0;
   
     for(int i=0;i<arr.length;i++)
   
     {
         
   if(arr[i] > big)
   
         {
        
        big=arr[i];
     
       }
       
    
        }
     
    System.out.println("The biggest number is : "+big);
  
  }
   public static void main(String args[]) 
 
   {
      
  int arr[]={5,8,4,6,2};
  
    SmallestAndBiggest.smallest(arr);
 
      SmallestAndBiggest.biggest(arr);
 
   }

}




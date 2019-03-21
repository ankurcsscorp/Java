public class FindDuplicate

{
   
 public static void duplicate(int arr[])

    {
   
    for(int i=0;i< arr.length-1;i++)
      
  {
        
    for(int j=i+1;j< arr.length;j++)
   
         {
              
  if(arr[i]==arr[j] && i!=j)
   
             {
             
       System.out.println("Duplicate array is : " + arr[i]);
   
   
          }
   

         }
  
      }
  
  }
  

  public static void main(String [] args)
 
   {
     
   int arr[]={1,2,5,9,2,6,8};
    
    FindDuplicate.duplicate(arr);
 
   }

}
   
 public class AllArrayValueIsEqual
 
{ 
  
  static boolean equallity(int arr[]) 
  
  { 
   
     for (int i = 0; i < arr.length; i++)  
 
       { 
  
          while (arr[i] % 2 == 0)  

 
           { 
    
            arr[i] = arr[i]/2; 
 
           } 
  
          while (arr[i] % 3 == 0) 
 
           { 
        
        arr[i] =arr[i]/ 3; 
    
        } 
 
       } 
 
       for (int i = 1; i < arr.length; i++)  
  
      { 
 
           if (arr[i] != arr[0]) 
  
          { 
   
             return false; 
  
          } 
   
     } 
  

        return true; 

    } 

    public static void main(String[] args)
  
    { 
    
    int arr[] = {50, 75, 100,25}; 
  
   
   
  
        if (equallity(arr))  
  
      { 
       
     System.out.println("Yes"); 
   
     }  
    
    else 
  
      { 
    
        System.out.println("No"); 
 
       } 
 
   }
 
}  
public class StringConcept
{
  public static void main(String [] args)

{
int k=0;
      String st="abcd";
     String str[]={"donkey","cab","apple"};

 String newStr[]= new String[str.length];
  
    char c[]=st.toCharArray();
  
  
     for(int i=0;i<c.length;i++)
 
     {
    
       for(int j=0;j<str.length;j++)

      {
 
       if(st.charAt(i)==str[j].charAt(0))

          
        {
	
newStr[k]=str[j];

	k++;

} 
 
  }
 
     

  }


	for(int i=0;i<newStr.length;i++)


	{
	
    System.out.println(newStr[i]);

	}
 
}

}

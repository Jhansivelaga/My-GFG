//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            if (new Sol().checkBinary (s))
    		    System.out.println ("VALID");
    		else
    		    System.out.println ("INVALID");
        
System.out.println("~");
}
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean checkBinary (String s)
    {
        // your code here  
        //iterate through the string to check for invalid condition
        int firstOne = -1;
        int lastOne = -1;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i)=='1'){
                    if(firstOne == -1){
                        firstOne =i;
                    }
                    lastOne =i;
                }
            }
                if (firstOne != -1 && lastOne != -1){
                    //if any o appears btwn frst and lst 1 , then invalid
                    for(int i = firstOne +1; i<lastOne;i++){
                        if (s.charAt(i)=='0'){
                            return false;
                        }
                    }
                }
                return true; //if no invalid conditions,the string is valid
            }
        }
    
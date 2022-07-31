// Manav Patel 21CE097
//Implement Caesar Cipher

import java.util.Scanner;      
public class prac10
{  
    public static final String Alphabets = "abcdefghijklmnopqrstuvwxyz";   
    public static String encryptData(String inputStr, int shiftKey)  //Method for encrypt data
    {  
        inputStr = inputStr.toLowerCase();   
        String encryptStr = "";   
          
        
        for (int i = 0; i < inputStr.length(); i++)   
        {   
            
            int pos = Alphabets.indexOf(inputStr.charAt(i));  
            int ep = (shiftKey + pos) % 26;   
            char encryptChar = Alphabets.charAt(ep);   
            encryptStr += encryptChar;   
        }    
        return encryptStr;   
    }   
    public static String decryptstr(String inputStr, int shiftKey)   
    {   
        inputStr = inputStr.toLowerCase();  //convert into lowercase  
        String decrypdata = "";     
        for (int i = 0; i < inputStr.length(); i++)   
        {    
            int at = Alphabets.indexOf(inputStr.charAt(i)); //Getting index of char..  
            int x = (at - shiftKey) % 26;   
            if (x < 0){   
                x = Alphabets.length() + x;   
            }   
            char decryptChar = Alphabets.charAt(x);  
            decrypdata += decryptChar;   
        }   
        return decrypdata;   
    }   
    public static void main(String[] args)   
    {   
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a string: ");   
        String Str = sc.nextLine();   
          
        System.out.println("Enter the value by which each character string gets shifted: ");   
        int shiftby = Integer.valueOf(sc.nextLine());   
          
        System.out.println("Encrypted string : "+encryptData(Str, shiftby));   
        System.out.println("Input string : "+decryptstr(encryptData(Str, shiftby), shiftby));   
          
        sc.close();   
    }   
}
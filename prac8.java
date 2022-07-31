// Manav Patel 21CE097

import java.util.Scanner;

public class prac8
{
  
public static void main (String[] args)
{
  Scanner sc = new Scanner (System.in);
  String[] ans= { "D","B","D","C","C","D","A","E","A","D"}; // String of answerkey
  String[][] str = new String[8][10];    // For get 10-answer of 8 students
  System.out.println("Fill in the eight student's answers to 10 questions:");
  for (int i =0;i<str.length;i++)
  {
    int count =0;
    for (int j=0;j<str[i].length;j++)
    {
      str[i][j] = sc.next();  // Get input  answers of students  
      if(str[i][j].equalsIgnoreCase(ans[j]))   // Ignor case of string 
        count++;
    }
    System.out.println("Student's " + i+1 + " correct answers are " + count); 
  }
  
}

}
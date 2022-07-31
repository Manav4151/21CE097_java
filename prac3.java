// Manav Patel 21CE097
/*
 Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class prac3 {
    public void lastDigit(int a, int b) {
        String strA = Integer.toString(a);  // For convert intteger into string 
        String strB = Integer.toString(b);
        

        //if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1))              for input of two string
        if (strA.charAt(strA.length() - 1) == strB.charAt(strB.length() - 1))   // string function .length()--> count string length 
                                                                                // .charAt()--> Charecter at index xyz.
        {
            System.out.println(true);
            
        }
        else
        {
            System.out.println(false);
            
        }
      }
      public static void main(String[] args) {
        prac3 p1=new prac3();
        p1.lastDigit(4, 173);
      }
}

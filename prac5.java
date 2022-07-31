// Manav Patel 21CE097
/*
 Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both 

strings.stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
public class prac5 {
    public int str(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length() - 1; i++) 
        {
            //creat substring of main string, .substring(start index , last index 
            String a1 = a.substring(i, i + 2);
            String b1 = b.substring(i, i + 2);
            if (a1.equals(b1))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        prac5 p5 = new prac5();
        
        System.out.println(p5.str("abc", "abc"));
    }
}

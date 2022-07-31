// Manav Patel 21CE097

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

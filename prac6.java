// Manav Patel 21CE097
/*
 Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

 */
public class prac6 {
  public static void main(String[] args) {
      String[] s= {"a","b","c","a"};
      String s1 = "a";
      int cout =0;
      for(int i=0;i<s.length;i++)
      {
          if(s[i].equals(s1))
          {
              cout++;
          }
      }
      int j=0;
      String[] sc = new String[s.length - cout];
      for(int i=0;i<s.length;i++) {
          if (!s[i].equals(s1)) {
              sc[j] = s[i];
              j++;
          }
      }
          System.out.println(sc);

  }
}

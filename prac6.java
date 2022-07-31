// Manav Patel 21CE097

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

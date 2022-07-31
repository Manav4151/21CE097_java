// Manav Patel 21CE097
public class prac4 {
    public boolean arr123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
          if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
      }

      public static void main(String[] args) {
        prac4 p4=new prac4();
        int [] num = {1,2,2,5};
        System.out.println(p4.arr123(num));
        
      }
}

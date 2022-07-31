// Manav Patel 21CE097
/*The problem is to check whether a given Sudoku solution is correct. */
public class prac9 {
    
    // boolean check method for return True or False
        public static boolean check(int arr[][]) {
            boolean b = true;
            for(int i=0; i<9;i++) {
                int sum =0;
                for(int j=0;j<9;j++) {
                    sum =sum+ arr[i][j];
                }
                if(sum!=45) {
                    b= false;
                    break;
                }
            }
            return b;
        }

    public static void main(String args[]) {
        // 2D array for answer of sudoku
        int ans[][] = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

        System.out.println(check(ans));  //Call method check
    }
}

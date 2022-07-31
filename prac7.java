// Manav Patel 21CE097
/*
  Display numbers in a pyramid pattern. 

                   1
                 1 2 1
                1 2 4 2 1
              1 2 4 8 4 2 1
            1 2 4 8 16 8 4 2 1
         1 2 4 8 16 32 16 8 4 2 1
       1 2 4 8 16 32 64 32 16 8 4 2 1

 */
public class prac7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) // First loop for no. of rows
        {
            for (int j = 8; j > i; j--) // Crate triangle for numbers
            {
                System.out.print("  ");

            }
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * 2;
            }
            c = c / 4;
            for (int j = 1; j < i; j++) {
                System.out.print(c + " ");
                c = c / 2;
            }
            System.out.println();
        }
    }
}

// Manav Patel 21CE097
public class prac2 {
    
        public void startOz(String str){
            if (str.startsWith("oz")){
            System.out.println("oz"); 
            }
            else if (str.startsWith("o"))
              System.out.println("o");
            else if (str.startsWith("z", 1))
              System.out.println("z");
            else
              System.out.println(" ");
          
    }

    
        public static void main(String[] args) {
            
            prac2 p1= new prac2();
            p1.startOz("oox");
        }
}
    


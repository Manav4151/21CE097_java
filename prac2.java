// Manav Patel 21CE097
/*
 Given a string, return a string made of the first 2 chars (if present), however include first  char  only  if  it  is  'o' and  include  the  second  only  if  it  is  'z',  so  "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o" 

 */
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
    


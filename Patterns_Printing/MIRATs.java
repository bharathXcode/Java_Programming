public class MIRATs {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/*

Mirror Inverted Right angled Triangle (rows=5)

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/

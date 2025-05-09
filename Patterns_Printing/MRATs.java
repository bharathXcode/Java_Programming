public class MRATs {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){    //(rows-i) for spaces
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

Mirror Right angled Triangle (rows=5)

        * 
      * * 
    * * * 
  * * * *
* * * * *

*/

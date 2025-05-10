package Imp_Patterns;

public class hollowHeartS {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            for(int j=0; j<=6; j++){
                if((i==1 && j%3==0) || (i==0 && j%3!=0) || (i-j==2) || (i+j==8)){ // remember its 3 not 2 
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    } 
}

/*

  * *   * *   
*     *     *
*           *
  *       *
    *   *
      *

*/

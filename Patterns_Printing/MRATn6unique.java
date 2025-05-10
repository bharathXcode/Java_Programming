public class MRATn6unique {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1; i<=rows; i++){
             for(int j=1; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(rows+1-i+" "); // (A-Z==>65 to 90)  (a-z==>97 to 122) S.o.p((char)(j+64)+" ") rows+1-i here
            }
            System.out.println();
        }
    }   
}

/*

        5 
      4 4 
    3 3 3 
  2 2 2 2 
1 1 1 1 1

*/

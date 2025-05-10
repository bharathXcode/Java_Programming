public class MIRATn3 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" "); // (A-Z==>65 to 90)  (a-z==>97 to 122) S.o.p((char)(j+64)+" ")
            }
            System.out.println();
        }
    }
}

/*

5 4 3 2 1 
  4 3 2 1 
    3 2 1
      2 1
        1


*/
public class MRATn3 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows; i++){
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
        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1


*/
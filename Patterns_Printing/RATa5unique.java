public class RATa5unique {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows;i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}

/*

A 
B B 
C C C 
D D D D 
E E E E E 

*/

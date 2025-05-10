public class RATa6unique {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(rows+1-i+64)+" ");
            }
            System.out.println();
        }
    }   
}

/*

E 
D D       
C C C     
B B B B   
A A A A A 


*/

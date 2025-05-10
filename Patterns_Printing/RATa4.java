public class RATa4 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=rows+1-i; j<=rows; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }   
}
/*

E 
D E       
C D E     
B C D E   
A B C D E

*/
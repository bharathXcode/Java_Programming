public class RATa3 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=i; j>=1; j--){
                System.out.print((char)(j+64)+" "); // (A-Z==>65 to 90)  (a-z==>97 to 122)
            }
            System.out.println();
        }
    }
}

/*

A 
B A 
C B A 
D C B A 
E D C B A

*/
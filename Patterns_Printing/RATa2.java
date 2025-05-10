public class RATa2 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=rows; j>=rows+1-i; j--){
                System.out.print((char)(j+64)+" "); // (A-Z==>65 to 90)  (a-z==>97 to 122)
            }
            System.out.println();
        }
    } 
}

/*

E 
E D       
E D C     
E D C B   
E D C B A


*/
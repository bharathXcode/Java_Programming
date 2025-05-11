public class IRATn1 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows; i>=1; i--){
            for(int j=1;j<=i; j++){
                System.out.print(j+" ");  // (A-Z==>65 to 90)  (a-z==>97 to 122) syntax: S.o.p((char)(j+64)+" ")
            }
            System.out.println();
        }
    }  
}

/*

1 2 3 4 5 
1 2 3 4   
1 2 3     
1 2       
1 


*/
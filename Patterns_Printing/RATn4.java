public class RATn4 {
    public static void main(String[] args) {
        
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=rows+1-i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }   
}
/*

5 
4 5
3 4 5
2 3 4 5
1 2 3 4 5

*/
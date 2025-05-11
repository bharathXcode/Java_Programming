public class IRATn7inc {
    public static void main(String[] args) {
        int rows=4;
        int num=1;
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                // System.out.print(num+" "); // (char)(num+64)
                System.out.print((char)(num+64)+" ");
                num++;
            }
            System.out.println();
        }
    }  
}

/*

1 2 3 4 
5 6 7
8 9
10

A B C D 
E F G
H I
J

*/

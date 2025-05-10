public class RATa7inc {
    public static void main(String[] args) {
        int rows=5;
        int num=1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(num+64)+" ");
                num++;
            }
            System.out.println();
        }
    }  
}

/*

A 
B C       
D E F     
G H I J   
K L M N O 


*/

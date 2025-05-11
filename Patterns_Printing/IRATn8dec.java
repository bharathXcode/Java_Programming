public class IRATn8dec {
    public static void main(String[] args) {
        int rows=5;
        int num=15;
        for(int i=rows; i>=1; i--){
           
            for(int j=1; j<=i; j++){
                //System.out.print(num+" "); 
                System.out.print((char)(num+64)+" ");
                num--;
            }
            System.out.println();
        }
    }
}

/*   spaces are the issue in numbers , in alphabets no problem

15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1

O N M L K 
J I H G 
F E D 
C B 
A

*/

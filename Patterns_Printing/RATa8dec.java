public class RATa8dec {
    public static void main(String[] args) {
        int rows=5;
        int num=15;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(num+64)+"   ");
                num--;
            }
            System.out.println();
        }
    }
}

/*

O   
N   M   
L   K   J   
I   H   G   F   
E   D   C   B   A 

*/

public class MIRAToddEvenOneZero {
    public static void main(String[] args) {
        int rows=5;
        int k=1;
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                if(k%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
                k++;
            }
            System.out.println();
        }
    } 
}

/*

1 0 1 0 1 
  0 1 0 1
    0 1 0
      1 0
        1
      

*/
public class RAToddEvenOneZero {
    public static void main(String[] args) {
        int rows=5;
        int k=1;
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=i; j++){
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

1 
0 1         
0 1 0       
1 0 1 0     
1 0 1 0 1   
0 1 0 1 0 1


*/
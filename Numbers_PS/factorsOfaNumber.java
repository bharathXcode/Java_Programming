package Numbers_PS;

public class factorsOfaNumber {
    public static void main(String[] args) {
        int num=24;
        for(int i=1; i<=24; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*The factors of Number 24 is 
 
1 2 3 4 6 8 12 24 

*/

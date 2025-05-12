package Numbers_PS;

import java.util.Scanner;

public class factorsCount {
    public static int count(int x){
        int factorcount=0;
        for(int i=1; i<=x; i++){
            if(x%i==0){
                System.out.println(i+" ");
                factorcount++;
            }
        }
        return factorcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int res =count(n);
        System.out.println("No. of factors: "+res);
        sc.close();
    }
}

/*

Enter the number: 
24
1 
2
3
4
6
8
12
24
No. of factors: 8


*/

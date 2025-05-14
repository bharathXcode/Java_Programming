class DecimalToBinary{

    
    public static String DtoB1(int x) {     // Inbuilt Method just 2 lines 
    return Integer.toBinaryString(x);
}

    public static String DtoB(int x){      // Without Inbuilt method
        String binary="";
        if(x==0) return "0";
        while(x!=0){
            int rem = x%2;
            binary=rem+binary;
            x=x/2;
        }
        return binary;
    } 
    public static void main(String[] args) {
        int n=13;
        String res=DtoB(n);              // sending to without inbuilt method
        String res1=DtoB1(n);            // sending to inbuilt method
        System.out.println(res);
        System.out.println(res1);
    }
}

/* 

 n = 13
 Iteration 1: x = 13, rem = 13 % 2 = 1, binary = "1", x → 13 / 2 = 6
 Iteration 2: x = 6,  rem = 6  % 2 = 0, binary = "01", x → 6  / 2 = 3
 Iteration 3: x = 3,  rem = 3  % 2 = 1, binary = "101", x → 3  / 2 = 1
 Iteration 4: x = 1,  rem = 1  % 2 = 1, binary = "1101", x → 1  / 2 = 0
 Loop ends because x == 0  
 
 */

 /*
 Output:

 1101
 1101

 */
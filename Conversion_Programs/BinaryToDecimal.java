class BinaryToDEcimal{

// Inbuilt method which takes binary in String Format and gives back int ie. decimal 
public static int BtoD1(String binary){
    return Integer.parseInt(binary, 2);
}


// wihtout inbuilt which takes int as argument and also returns int as a result 
public static int BtoD(int binary){

    int decimal=0;
    int power=0;

    while(binary>0){
        int digit=binary%10;

        if(digit!=0 && digit !=1){
            System.out.println("invalid binary number");
        }
        decimal=((int)(decimal+digit * Math.pow(2,power)));  // if we use Math.pow() double will the default datatype , we have type cast it int in this case.
        binary = binary/10;
        power++;
    }
    return decimal;
}

public static void main(String[] args) {
    int n=1001;
    String n1="1001";

    int res=BtoD(n);                     // sending to normal method 
    int res1=BtoD1(n1);                  // sending to inbuilt method
    System.out.println(res);
    System.out.println(res1);
    
  }
}

/*
Output: 
9
9 

*/

// Iteration 1:
        // binary = 1011, digit = 1011 % 10 = 1
        // decimal += 1 * 2^0 = 1, new decimal = 1
        // binary = 1011 / 10 = 101
        // power = 1

// Iteration 2:
        // binary = 101, digit = 101 % 10 = 1
        // decimal += 1 * 2^1 = 2, new decimal = 3
        // binary = 101 / 10 = 10
        // power = 2

// Iteration 3:
        // binary = 10, digit = 10 % 10 = 0
        // decimal += 0 * 2^2 = 0, new decimal = 3
        // binary = 10 / 10 = 1
        // power = 3

// Iteration 4:
        // binary = 1, digit = 1 % 10 = 1
        // decimal += 1 * 2^3 = 8, new decimal = 11
        // binary = 1 / 10 = 0
        // power = 4

// Loop ends because binary = 0

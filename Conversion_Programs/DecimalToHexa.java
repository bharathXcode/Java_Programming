public class DecimalToHexa {
    
    //using inbuilt method 
    public static String DtoH1(int decimal){
        return Integer.toHexString(decimal);
    }


    // without using inbuilt method 
    public static String DtoH(int decimal){
        String hex="";

        // Mapping for values 10–15
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while(decimal>0){
            int rem=decimal%16;
            hex = hexChars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;

    }
    public static void main(String[] args) {
        int n = 233;
        String hex = DtoH(n);
        String hex1 = DtoH1(n);
        System.out.println(hex);
        System.out.println(hex1);
    }
}

/*
Output:
E9
E9 
*/



// Iteration 1:
        // decimal = 233
        // remainder = 233 % 16 = 9 → hex char = '9'
        // hex = "9"
        // decimal = 233 / 16 = 14

        // Iteration 2:
        // decimal = 14
        // remainder = 14 % 16 = 14 → hex char = 'E'
        // hex = "E" + "9" = "E9"
        // decimal = 14 / 16 = 0 → loop ends

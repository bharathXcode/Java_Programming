public class HexaToDecimal {

    public static int HtoD1(String hex){
        return Integer.parseInt(hex,16);
    }



    // without using inbuilt 
    public static int HtoD(String hex){
        int decimal=0;
        int power=0;
        
        // Loop through each hex character from right to left
        for(int i=hex.length()-1; i>=0; i--){
            char ch = hex.charAt(i);
            int value=0;
            
            // Convert char to its decimal value
            if(ch >= '0' && ch <='9'){
                value=ch-'0';  // e.g., '9' - '0' = 9 
            }
            else if(ch >='A' && ch <='F'){
                value=10+(ch-'A'); // // e.g., 'E' - 'A' = 4 → 10 + 4 = 14
            }
            else if(ch >='a' && ch <='f'){
                value=10+(ch-'a'); // // e.g., 'e' - 'a' = 4 → 10 + 4 = 14
            }
            else{
                System.out.println("invalid hexa decimal nunber");
            }

            decimal=(int)(decimal+value*Math.pow(16,power));
            power++;
        }
        return decimal;
        

    }

    public static void main(String[] args) {
        String hex="E9";
        int decimal=HtoD(hex);
        int decimal1=HtoD1(hex);
        System.out.println(decimal);
        System.out.println(decimal1); 
    } 
}

/*
Output:
233
233 for E9 
*/


// ===== Iteration comments =====
            // Iteration 1 (i = 1):
            // ch = '9' → value = 9
            // power = 0 → 16^0 = 1
            // decimal += 9 * 1 = 9 → total = 9

            // Iteration 2 (i = 0):
            // ch = 'E' → value = 14
            // power = 1 → 16^1 = 16
            // decimal += 14 * 16 = 224 → total = 233
            // ==============================

            // Move to next power of 16
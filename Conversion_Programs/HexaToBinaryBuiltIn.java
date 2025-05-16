public class HexaToBinaryBuiltIn {

    public static String hexToBinary(String hex) {
        int decimal = Integer.parseInt(hex, 16);                 // Hex to decimal
        String binary = Integer.toBinaryString(decimal);        // Decimal to binary
        return binary;
    }

    public static void main(String[] args) {
        String hex = "15D";
        String binary = hexToBinary(hex);
        System.out.println("Binary: " + binary);  // Output: 101011101
    }
}

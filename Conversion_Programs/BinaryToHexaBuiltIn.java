public class BinaryToHexaBuiltIn {

    public static String binaryToHex(String binary) {
        int decimal = Integer.parseInt(binary, 2);              // Convert binary to decimal
        String hex = Integer.toHexString(decimal).toUpperCase(); // Convert decimal to hex
        return hex;
    }

    public static void main(String[] args) {
        String binary = "101011101";
        String hex = binaryToHex(binary);
        System.out.println("Hexadecimal: " + hex); // Output: 15D
    }
}

public class HexaToBinaryBasic {

    public static String hexToBinary(String hex) {
        String binary = "";

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10; // For 'A' to 'F'
            }

            // Convert decimal value (0–15) to 4-bit binary manually
            String bits = "";
            int mask = 8; // 2^3

            while (mask > 0) {
                if (value >= mask) {
                    bits += "1";
                    value -= mask;
                } else {
                    bits += "0";
                }
                mask /= 2;
            }

            binary += bits;
        }

        return binary;
    }

    public static void main(String[] args) {
        String hex = "15D";
        String binary = hexToBinary(hex);
        System.out.println("Binary: " + binary);  // Output: 000101011101
    }
}


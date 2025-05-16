public class BinaryToHexa {

    public static String binaryToHex(String binary) {
        // Step 1: Pad binary string with leading 0s if not a multiple of 4
        int length = binary.length();
        int padLength = (4 - (length % 4)) % 4;
        String paddedBinary = "";

        for (int i = 0; i < padLength; i++) {
            paddedBinary += "0";
        }

        paddedBinary += binary;

        // Step 2: Process 4 characters at a time
        String hex = "";
        int i = 0;

        while (i < paddedBinary.length()) {
            int value = 0;

            // Convert next 4 binary digits to decimal manually
            for (int j = 0; j < 4; j++) {
                char bit = paddedBinary.charAt(i);
                value = value * 2 + (bit - '0');
                i++;
            }

            // Convert decimal to hex char
            if (value < 10) {
                hex += (char) (value + '0');
            } else {
                hex += (char) (value - 10 + 'A');
            }
        }

        return hex;
    }

    public static void main(String[] args) {
        String binary = "101011101";
        String hex = binaryToHex(binary);
        System.out.println("Hexadecimal: " + hex);  // Output: 15D
    }
}

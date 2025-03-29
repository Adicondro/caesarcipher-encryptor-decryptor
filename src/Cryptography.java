public class Cryptography {

    static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = alphabet.length();

        for (char c : message.toCharArray()) {
            int index = alphabet.indexOf(c);
            if (index != -1) {
                result.append(alphabet.charAt((index + shift) % len));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift);
    }

    public static void main(String[] args) {
        String message = "HELLO WORLD";
        int shift = 5;

        String encrypted = encrypt(message, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        System.out.println("Shift: " + shift);
    }
}

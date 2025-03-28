public class Cryptography {

    static String encrypt(String message, int shift) {
        String test = "";
        for (int i = 0; i < message.length(); i++) {
            test += (char) (message.charAt(i) + shift);
        }
        return test;
    }

    static String decrypt(String message, int shift) {
        String test = "";
        for (int i = 0; i < message.length(); i++) {
            test += (char) (message.charAt(i) - shift);
        }
        return test;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Fuck You";
        String encryptedMsg = encrypt(msg, 5);
        // Send Message

        // Intercept
        System.out.println(encryptedMsg);

        // Receive Message
        String decryptedMsg = decrypt(encryptedMsg, 5);
        System.out.println(decryptedMsg);
    }
}

public class Cryptography {

    static String encrypt(String message) {
        String test = "";
        for (int i = 0; i < message.length(); i++) {
            test += (char) (message.charAt(i) + 1);
        }
        return test;
    }

    static String decrypt(String message) {
        String test = "";
        for (int i = 0; i < message.length(); i++) {
            test += (char) (message.charAt(i) - 1);
        }
        return test;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Fuck You";
        String encryptedMsg = encrypt(msg);
        // Send Message

        // Intercept
        System.out.println(encryptedMsg);

        // Receive Message
        String decryptedMsg = decrypt(encryptedMsg);
        System.out.println(decryptedMsg);
    }
}

public class CaesarCipher {

    static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                int p = c - 'A'; // Konversi huruf ke angka (A=0, B=1, ..., Z=25)
                int cNew = (p + shift) % 26; // Rumus: (P + K) mod 26
                result.append((char) ('A' + cNew));
            } else if (Character.isLowerCase(c)) {
                int p = c - 'a';
                int cNew = (p + shift) % 26;
                result.append((char) ('a' + cNew));
            } else {
                result.append(c); // Karakter lain tetap sama
            }
        }
        return result.toString();
    }

    static String decrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                int cNew = (c - 'A' - shift + 26) % 26; // Rumus: (C - K + 26) mod 26
                result.append((char) ('A' + cNew));
            } else if (Character.isLowerCase(c)) {
                int cNew = (c - 'a' - shift + 26) % 26;
                result.append((char) ('a' + cNew));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "HELLO WORLD";
        int shift = 3;

        String encrypted = encrypt(message, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}


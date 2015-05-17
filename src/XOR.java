


/**
 * Created by Влад on 14.04.2015.
 */
public class XOR {
    public static void main(String[] params) {

        String message = new String("Rainbow");
        char[] key = {1, 2};
        System.out.println("Message: " + message);
        String cryptedMessage = crypt(message, key);
        System.out.println("Crypted message: " + cryptedMessage);
        String cryptedMessageIsCryptedAgain = crypt(cryptedMessage, key);
        System.out.println("Crypted message crypted: " + cryptedMessageIsCryptedAgain);
    }

    public static String crypt(String message, char[] key) {
        char[] array = message.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] ^= key[i % key.length];
        }
        message = String.copyValueOf(array);
        return message;
    }

}






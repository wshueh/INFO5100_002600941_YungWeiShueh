import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;

public class EncryptionExercise{

    public static void main(String[] args) throws Exception {
        symmetricEncryption();
        asymmetricEncryption();
        signingDemo();
    }

     //Performs symmetric encryption and decryption using AES/GCM/NoPadding
    public static void symmetricEncryption() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey key = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] iv = new byte[12];
        (new java.security.SecureRandom()).nextBytes(iv);
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        String plainText = "Hi! Alice and Bob.";
        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] cipherMessage = cipher.doFinal(plainText.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(cipherMessage));
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        String decryptedMessage = new String(cipher.doFinal(cipherMessage));
        System.out.println("Decrypted: " + decryptedMessage);
        System.out.println("---------------------------------------");
    }

    //Performs asymmetric encryption and decryption using RSA with PKCS1Padding
    public static void asymmetricEncryption() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        String plainText = "Hi! Alice and Bob.";
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        byte[] cipherMessage = cipher.doFinal(plainText.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(cipherMessage));
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        String decryptedMessage = new String(cipher.doFinal(cipherMessage));
        System.out.println("Decrypted: " + decryptedMessage);
        System.out.println("---------------------------------------");
    }

    //Creates and verifies a digital signature using RSA and SHA-256
    public static void signingDemo() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        Signature signature = Signature.getInstance("SHA256withRSA");
        String message = "Hi! Alice and Bob.";
        signature.initSign(keyPair.getPrivate());
        signature.update(message.getBytes());
        byte[] digitalSignature = signature.sign();
        System.out.println("Signature: " + Base64.getEncoder().encodeToString(digitalSignature));
        signature.initVerify(keyPair.getPublic());
        signature.update(message.getBytes());
        boolean goVerify = signature.verify(digitalSignature);
        System.out.println("Signature Verified: " + goVerify);
        System.out.println("---------------------------------------");
    }
}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7333455 {

    private static String doHash(String frase, String algorithm) {
        try {
            String ret;
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(frase.getBytes());
            BigInteger bigInt = new BigInteger(1, md.digest());
            ret = bigInt.toString(16);
            return ret;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

}

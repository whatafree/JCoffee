import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10298327 {

    private String encode(String arg) {
        try {
            final MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(arg.getBytes());
            byte[] md5sum = digest.digest();
            final BigInteger bigInt = new BigInteger(1, md5sum);
            final String output = bigInt.toString(16);
            return output;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("MD5 required: " + e.getMessage(), e);
        }
    }

}

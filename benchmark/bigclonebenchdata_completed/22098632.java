import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22098632 {

    private String getMd5(String base64image) {
        String token = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(base64image.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            token = hash.toString(16);
        } catch (NoSuchAlgorithmException nsae) {
        }
        return token;
    }

}

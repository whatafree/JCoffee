import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10521243 {

    public String md5(String phrase) {
        MessageDigest m;
        String coded = new String();
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(phrase.getBytes(), 0, phrase.length());
            coded = (new BigInteger(1, m.digest()).toString(16)).toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        if (coded.length() < 32) {
            coded = "0" + coded;
        }
        return coded;
    }

}

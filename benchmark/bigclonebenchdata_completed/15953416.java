import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15953416 {

    public static String getMD5(String password) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String salt = "UseTheForce4";
            password = salt + password;
            md5.update(password.getBytes(), 0, password.length());
            password = new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception e) {
        }
        return password;
    }

}

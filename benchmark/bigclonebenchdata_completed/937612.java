import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c937612 {

    public String new2Password(String passwd) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            String clearPassword = passwd;
            md.update(clearPassword.getBytes());
            byte[] digestedPassword = md.digest();
            return new String(digestedPassword);
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println("MD5 doesn't exist");
            System.out.println(e.toString());
            return null;
        }
    }

}

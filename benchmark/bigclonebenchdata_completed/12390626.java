import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12390626 {

    public static String MD5(String input) throws Exception {
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(input.getBytes(), 0, input.length());
        input = new BigInteger(1, m.digest()).toString(16);
        if (input.length() == 31) input = "0" + input;
        return input;
    }

}

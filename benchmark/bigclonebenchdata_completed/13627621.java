import java.io.*;
import java.lang.*;
import java.util.*;



class c13627621 {

    public static synchronized String hash(String plaintext) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            return null;
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
        byte raw[] =(byte[])(Object) md.digest();
        return(String)(Object) (new BASE64Encoder()).encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

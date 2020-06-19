import java.io.*;
import java.lang.*;
import java.util.*;



class c20002564 {

    public synchronized String encrypt(String password) {
        try {
            MessageDigest md = null;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
            return hash;
        } catch (UncheckedIOException e) {
            System.out.println("Algorithm SHA-1 is not supported");
            return null;
        } catch (UnsupportedEncodingException e) {
            System.out.println("UTF-8 encoding is not supported");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

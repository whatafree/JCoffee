import java.io.*;
import java.lang.*;
import java.util.*;



class c22899738 {

    public synchronized String encrypt(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes("UTF-8"));
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

import java.io.*;
import java.lang.*;
import java.util.*;



class c19782619 {

    public synchronized String encrypt(String p_plainText) throws ServiceUnavailableException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new ServiceUnavailableException(e.getMessage());
        }
        try {
            md.update(p_plainText.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new ServiceUnavailableException(e.getMessage());
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class ServiceUnavailableException extends Exception{
	public ServiceUnavailableException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

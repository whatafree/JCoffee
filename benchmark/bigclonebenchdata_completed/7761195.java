
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7761195 {

    public synchronized String encrypt(String plaintext) throws Exception {
        StringBuffer sb = new StringBuffer();
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        } catch (UncheckedIOException e) {
            throw new Exception(e.getMessage());
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UncheckedIOException e) {
            throw new Exception(e.getMessage());
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

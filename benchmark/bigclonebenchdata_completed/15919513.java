
import java.io.UncheckedIOException;


class c15919513 {

    public static byte[] computeMD5(String s) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(s.getBytes());
            return(byte[])(Object) md.digest();
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

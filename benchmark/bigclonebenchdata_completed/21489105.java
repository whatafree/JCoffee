
import java.io.UncheckedIOException;


class c21489105 {
public static MyHelperClass LOG;
	public static MyHelperClass byteArrayToHex(byte[] o0){ return null; }
//public MyHelperClass LOG;
//	public MyHelperClass byteArrayToHex(byte[] o0){ return null; }

    public static String md5(String message, boolean base64) {
        MessageDigest md5 = null;
        String digest = message;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(message.getBytes());
            byte[] digestData =(byte[])(Object) md5.digest();
            if (base64) {
                Base64Encoder enc = new Base64Encoder();
                enc.translate(digestData);
                digest = new String((String)(Object)enc.getCharArray());
            } else {
                digest =(String)(Object) byteArrayToHex(digestData);
            }
        } catch (UncheckedIOException e) {
            LOG.warn("MD5 not supported. Using plain string as password!");
        } catch (Exception e) {
            LOG.warn("Digest creation failed. Using plain string as password!");
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64Encoder {

public MyHelperClass getCharArray(){ return null; }
	public MyHelperClass translate(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}


import java.io.UncheckedIOException;


class c2530139 {
public static MyHelperClass jcVariabili;
	public static MyHelperClass jcFunzioni;
//public MyHelperClass jcVariabili;
//	public MyHelperClass jcFunzioni;

    public static String md5(String input) {
        String res = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(input.getBytes());
            byte[] md5 =(byte[])(Object) algorithm.digest();
            String tmp = "";
            for (int i = 0; i < md5.length; i++) {
                tmp = (Integer.toHexString(0xFF & md5[i]));
                if (tmp.length() == 1) {
                    res += "0" + tmp;
                } else {
                    res += tmp;
                }
            }
        } catch (UncheckedIOException ex) {
            if ((boolean)(Object)jcVariabili.DEBUG) jcFunzioni.erroreSQL(ex.toString());
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
public MyHelperClass erroreSQL(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

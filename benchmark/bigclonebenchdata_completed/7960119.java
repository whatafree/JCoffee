
import java.io.UncheckedIOException;


class c7960119 {

    private void getRandomGuid(boolean secure) {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        long time = System.currentTimeMillis();
        long rand = 0;
        if (secure) {
            MyHelperClass secureRandom = new MyHelperClass();
            rand =(long)(Object) secureRandom.nextLong();
        } else {
            MyHelperClass random = new MyHelperClass();
            rand =(long)(Object) random.nextLong();
        }
        MyHelperClass id = new MyHelperClass();
        sbValueBeforeMD5.append(id);
        sbValueBeforeMD5.append(":");
        sbValueBeforeMD5.append(Long.toString(time));
        sbValueBeforeMD5.append(":");
        sbValueBeforeMD5.append(Long.toString(rand));
        String valueBeforeMD5 = sbValueBeforeMD5.toString();
        md5.update(valueBeforeMD5.getBytes());
        byte[] array =(byte[])(Object) md5.digest();
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < array.length; ++j) {
            int b = array[j] & 0xFF;
            if (b < 0x10) sb.append('0');
            sb.append(Integer.toHexString(b));
        }
        String guid;// = new String();
        guid = sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextLong(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2525897 {

    public static byte[] decode(String cryptPassword, byte[] encoded, byte[] salt)  throws Throwable {
        try {
            MyHelperClass DIGEST = new MyHelperClass();
            MessageDigest digester = MessageDigest.getInstance((String)(Object)DIGEST);
            MyHelperClass RANDOM = new MyHelperClass();
            SecureRandom random = SecureRandom.getInstance((String)(Object)RANDOM);
            digester.reset();
            MyHelperClass ITERATIONS = new MyHelperClass();
            for (int i = 0; i < (int)(Object)ITERATIONS; i++) {
                digester.update(salt);
                digester.update(cryptPassword.getBytes("UTF-8"));
            }
            byte[] hash = digester.digest();
            random.setSeed(hash);
            MyHelperClass CIPHER = new MyHelperClass();
            int maxKeySize =(int)(Object) Cipher.getMaxAllowedKeyLength(CIPHER);
//            MyHelperClass CIPHER = new MyHelperClass();
            KeyGenerator generator =(KeyGenerator)(Object) KeyGenerator.getInstance(CIPHER);
            generator.init(maxKeySize, random);
            SecretKey key =(SecretKey)(Object) generator.generateKey();
//            MyHelperClass CIPHER = new MyHelperClass();
            Cipher cipher =(Cipher)(Object) Cipher.getInstance(CIPHER);
            MyHelperClass Cipher = new MyHelperClass();
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decoded =(byte[])(Object) cipher.doFinal(encoded);
            return decoded;
        } catch (Exception e) {
            MyHelperClass StorePlugin = new MyHelperClass();
            StorePlugin.getDefault().log(e);
        }
        return new byte[0];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass log(Exception o0){ return null; }}

class KeyGenerator {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass generateKey(){ return null; }
	public MyHelperClass init(int o0, SecureRandom o1){ return null; }}

class SecretKey {

}

class Cipher {

public MyHelperClass doFinal(byte[] o0){ return null; }
	public static MyHelperClass getMaxAllowedKeyLength(MyHelperClass o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass init(MyHelperClass o0, SecretKey o1){ return null; }}

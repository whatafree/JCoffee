


class c19556732 {
public MyHelperClass readFile(String o0){ return null; }

    public boolean verifySignature() {
        try {
            MyHelperClass name = new MyHelperClass();
            byte[] data =(byte[])(Object) readFile(name + ".tmp1.bin");
            if (data == null) return false;
            if (data[data.length - 0x104] != 'N' || data[data.length - 0x103] != 'G' || data[data.length - 0x102] != 'I' || data[data.length - 0x101] != 'S') return false;
            byte[] signature = new byte[0x100];
            byte[] module = new byte[data.length - 0x104];
            System.arraycopy(data, data.length - 0x100, signature, 0, 0x100);
            System.arraycopy(data, 0, module, 0, data.length - 0x104);
            MyHelperClass BigIntegerEx = new MyHelperClass();
            BigIntegerEx power = new BigIntegerEx(BigIntegerEx.LITTLE_ENDIAN, new byte[] { 0x01, 0x00, 0x01, 0x00 });
//            MyHelperClass BigIntegerEx = new MyHelperClass();
            BigIntegerEx mod = new BigIntegerEx(BigIntegerEx.LITTLE_ENDIAN, new byte[] { (byte) 0x6B, (byte) 0xCE, (byte) 0xF5, (byte) 0x2D, (byte) 0x2A, (byte) 0x7D, (byte) 0x7A, (byte) 0x67, (byte) 0x21, (byte) 0x21, (byte) 0x84, (byte) 0xC9, (byte) 0xBC, (byte) 0x25, (byte) 0xC7, (byte) 0xBC, (byte) 0xDF, (byte) 0x3D, (byte) 0x8F, (byte) 0xD9, (byte) 0x47, (byte) 0xBC, (byte) 0x45, (byte) 0x48, (byte) 0x8B, (byte) 0x22, (byte) 0x85, (byte) 0x3B, (byte) 0xC5, (byte) 0xC1, (byte) 0xF4, (byte) 0xF5, (byte) 0x3C, (byte) 0x0C, (byte) 0x49, (byte) 0xBB, (byte) 0x56, (byte) 0xE0, (byte) 0x3D, (byte) 0xBC, (byte) 0xA2, (byte) 0xD2, (byte) 0x35, (byte) 0xC1, (byte) 0xF0, (byte) 0x74, (byte) 0x2E, (byte) 0x15, (byte) 0x5A, (byte) 0x06, (byte) 0x8A, (byte) 0x68, (byte) 0x01, (byte) 0x9E, (byte) 0x60, (byte) 0x17, (byte) 0x70, (byte) 0x8B, (byte) 0xBD, (byte) 0xF8, (byte) 0xD5, (byte) 0xF9, (byte) 0x3A, (byte) 0xD3, (byte) 0x25, (byte) 0xB2, (byte) 0x66, (byte) 0x92, (byte) 0xBA, (byte) 0x43, (byte) 0x8A, (byte) 0x81, (byte) 0x52, (byte) 0x0F, (byte) 0x64, (byte) 0x98, (byte) 0xFF, (byte) 0x60, (byte) 0x37, (byte) 0xAF, (byte) 0xB4, (byte) 0x11, (byte) 0x8C, (byte) 0xF9, (byte) 0x2E, (byte) 0xC5, (byte) 0xEE, (byte) 0xCA, (byte) 0xB4, (byte) 0x41, (byte) 0x60, (byte) 0x3C, (byte) 0x7D, (byte) 0x02, (byte) 0xAF, (byte) 0xA1, (byte) 0x2B, (byte) 0x9B, (byte) 0x22, (byte) 0x4B, (byte) 0x3B, (byte) 0xFC, (byte) 0xD2, (byte) 0x5D, (byte) 0x73, (byte) 0xE9, (byte) 0x29, (byte) 0x34, (byte) 0x91, (byte) 0x85, (byte) 0x93, (byte) 0x4C, (byte) 0xBE, (byte) 0xBE, (byte) 0x73, (byte) 0xA9, (byte) 0xD2, (byte) 0x3B, (byte) 0x27, (byte) 0x7A, (byte) 0x47, (byte) 0x76, (byte) 0xEC, (byte) 0xB0, (byte) 0x28, (byte) 0xC9, (byte) 0xC1, (byte) 0xDA, (byte) 0xEE, (byte) 0xAA, (byte) 0xB3, (byte) 0x96, (byte) 0x9C, (byte) 0x1E, (byte) 0xF5, (byte) 0x6B, (byte) 0xF6, (byte) 0x64, (byte) 0xD8, (byte) 0x94, (byte) 0x2E, (byte) 0xF1, (byte) 0xF7, (byte) 0x14, (byte) 0x5F, (byte) 0xA0, (byte) 0xF1, (byte) 0xA3, (byte) 0xB9, (byte) 0xB1, (byte) 0xAA, (byte) 0x58, (byte) 0x97, (byte) 0xDC, (byte) 0x09, (byte) 0x17, (byte) 0x0C, (byte) 0x04, (byte) 0xD3, (byte) 0x8E, (byte) 0x02, (byte) 0x2C, (byte) 0x83, (byte) 0x8A, (byte) 0xD6, (byte) 0xAF, (byte) 0x7C, (byte) 0xFE, (byte) 0x83, (byte) 0x33, (byte) 0xC6, (byte) 0xA8, (byte) 0xC3, (byte) 0x84, (byte) 0xEF, (byte) 0x29, (byte) 0x06, (byte) 0xA9, (byte) 0xB7, (byte) 0x2D, (byte) 0x06, (byte) 0x0B, (byte) 0x0D, (byte) 0x6F, (byte) 0x70, (byte) 0x9E, (byte) 0x34, (byte) 0xA6, (byte) 0xC7, (byte) 0x31, (byte) 0xBE, (byte) 0x56, (byte) 0xDE, (byte) 0xDD, (byte) 0x02, (byte) 0x92, (byte) 0xF8, (byte) 0xA0, (byte) 0x58, (byte) 0x0B, (byte) 0xFC, (byte) 0xFA, (byte) 0xBA, (byte) 0x49, (byte) 0xB4, (byte) 0x48, (byte) 0xDB, (byte) 0xEC, (byte) 0x25, (byte) 0xF3, (byte) 0x18, (byte) 0x8F, (byte) 0x2D, (byte) 0xB3, (byte) 0xC0, (byte) 0xB8, (byte) 0xDD, (byte) 0xBC, (byte) 0xD6, (byte) 0xAA, (byte) 0xA6, (byte) 0xDB, (byte) 0x6F, (byte) 0x7D, (byte) 0x7D, (byte) 0x25, (byte) 0xA6, (byte) 0xCD, (byte) 0x39, (byte) 0x6D, (byte) 0xDA, (byte) 0x76, (byte) 0x0C, (byte) 0x79, (byte) 0xBF, (byte) 0x48, (byte) 0x25, (byte) 0xFC, (byte) 0x2D, (byte) 0xC5, (byte) 0xFA, (byte) 0x53, (byte) 0x9B, (byte) 0x4D, (byte) 0x60, (byte) 0xF4, (byte) 0xEF, (byte) 0xC7, (byte) 0xEA, (byte) 0xAC, (byte) 0xA1, (byte) 0x7B, (byte) 0x03, (byte) 0xF4, (byte) 0xAF, (byte) 0xC7 });
//            MyHelperClass BigIntegerEx = new MyHelperClass();
            byte[] result =(byte[])(Object) (new BigIntegerEx(BigIntegerEx.LITTLE_ENDIAN, signature).modPow(power, mod).toByteArray());
            byte[] digest;
            byte[] properResult = new byte[0x100];
            for (int i = 0; i < properResult.length; i++) properResult[i] = (byte) 0xBB;
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            md.update(module);
            md.update("MAIEV.MOD".getBytes());
            digest =(byte[])(Object) md.digest();
            System.arraycopy(digest, 0, properResult, 0, digest.length);
            for (int i = 0; i < result.length; i++) if (result[i] != properResult[i]) return false;
            return true;
        } catch (Exception e) {
            System.out.println("Failed to verify signature: " + e.toString());
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LITTLE_ENDIAN;
public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class BigIntegerEx {

BigIntegerEx(){}
	BigIntegerEx(MyHelperClass o0, byte[] o1){}
	public MyHelperClass modPow(BigIntegerEx o0, BigIntegerEx o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

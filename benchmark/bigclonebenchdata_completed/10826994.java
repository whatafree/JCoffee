


class c10826994 {

    public static void copyFile(File in, File out) throws EnhancedException {
        try {
            FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
            FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
            sourceChannel.close();
            destinationChannel.close();
        } catch (Exception e) {
            throw new EnhancedException("Could not copy file " + in.getAbsolutePath() + " to " + out.getAbsolutePath() + ".", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class EnhancedException extends Exception{
	public EnhancedException(String errorMessage) { super(errorMessage); }
	EnhancedException(){}
	EnhancedException(String o0, Exception o1){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

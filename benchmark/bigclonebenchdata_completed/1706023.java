
import java.io.UncheckedIOException;


class c1706023 {

    public static void copyFile(File in, File out, boolean copyModified) throws IOException {
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        try {
            int maxCount = (64 * 1024 * 1024) - (32 * 1024);
            long size =(long)(Object) inChannel.size();
            long position = 0;
            while (position < size) {
                position += (long)(Object)inChannel.transferTo(position, maxCount, outChannel);
            }
            if (copyModified) out.setLastModified(in.lastModified());
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

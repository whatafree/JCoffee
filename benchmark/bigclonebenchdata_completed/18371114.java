


class c18371114 {
public static MyHelperClass MapMode;
	public static MyHelperClass close(FileChannel o0){ return null; }
//public MyHelperClass MapMode;
//	public MyHelperClass close(FileChannel o0){ return null; }

    public static void copy(final File source, final File dest) throws IOException {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long size =(long)(Object) in.size();
            MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
            out.write(buf);
            dest.setLastModified(source.lastModified());
        } finally {
            close(in);
            close(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}




class c19290859 {

    public static void copy(File sourceFile, File destinationFile) throws IOException {
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
        FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(destinationFile).getChannel());
        destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        sourceChannel.close();
        destinationChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

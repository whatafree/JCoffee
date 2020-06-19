


class c18991846 {

    public static void copyFile(File oldFile, File newFile) throws Exception {
        newFile.getParentFile().mkdirs();
        newFile.createNewFile();
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(oldFile).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(newFile).getChannel());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

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




class c11370967 {

    public void copyFile(File in, File out) throws Exception {
        FileChannel ic =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel oc =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        ic.transferTo(0, ic.size(), oc);
        ic.close();
        oc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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




class c588571 {

    public static void main(String[] args) throws Exception {
        String uri = args[0];
        Configuration conf = new Configuration();
        MyHelperClass URI = new MyHelperClass();
        FileSystem fs =(FileSystem)(Object) FileSystem.get(URI.create(uri), conf);
        InputStream in = null;
        try {
            in =(InputStream)(Object) fs.open(new Path(uri));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyBytes(in,(PrintStream)(Object) System.out, 4096, false);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeStream(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass copyBytes(InputStream o0, PrintStream o1, int o2, boolean o3){ return null; }
	public MyHelperClass create(String o0){ return null; }}

class Configuration {

}

class FileSystem {

public static MyHelperClass get(MyHelperClass o0, Configuration o1){ return null; }
	public MyHelperClass open(Path o0){ return null; }}

class InputStream {

}

class Path {

Path(String o0){}
	Path(){}}

class PrintStream {

}

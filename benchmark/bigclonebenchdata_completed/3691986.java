


class c3691986 {

    public static void copyFile(HttpServletResponse response, String file) throws IOException {
        MyHelperClass FileUtils = new MyHelperClass();
        response.setContentType(FileUtils.getContentType(file));
//        MyHelperClass FileUtils = new MyHelperClass();
        response.setContentLength(FileUtils.getContentLength(file));
//        MyHelperClass FileUtils = new MyHelperClass();
        response.setHeader("Content-Length", Integer.toString((int)(Object)FileUtils.getContentLength(file)));
        InputStream input =(InputStream)(Object) new FileInputStream(file);
        OutputStream output =(OutputStream)(Object) response.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, output, true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContentLength(String o0){ return null; }
	public MyHelperClass getContentType(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1, boolean o2){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

}

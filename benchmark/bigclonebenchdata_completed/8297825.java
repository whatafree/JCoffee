
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8297825 {

    public void upload(String ftpServer, String user, String password, String fileName, File source) throws MalformedURLException, IOException {
        if (ftpServer != null && fileName != null && source != null) {
            StringBuffer sb = new StringBuffer("ftp://");
            if (user != null && password != null) {
                sb.append(user);
                sb.append(':');
                sb.append(password);
                sb.append('@');
            }
            sb.append(ftpServer);
            sb.append('/');
            sb.append(fileName);
            sb.append(";type=i");
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                URL url = new URL(sb.toString());
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                bos = new BufferedOutputStream(urlc.getOutputStream());
                bis = new BufferedInputStream(new FileInputStream(source));
                int i;
                while ((i =(int)(Object) bis.read()) != -1) {
                    bos.write(i);
                }
            } finally {
                if (bis != null) try {
                    bis.close();
                } catch (UncheckedIOException ioe) {
                    ioe.printStackTrace();
                }
                if (bos != null) try {
                    bos.close();
                } catch (UncheckedIOException ioe) {
                    ioe.printStackTrace();
                }
            }
        } else {
            System.out.println("Input not available.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

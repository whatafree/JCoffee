
import java.io.UncheckedIOException;


class c388884 {

    public static void downloadFileFromHTTP(String address) {
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        int lastSlashIndex = address.lastIndexOf('/');
        if (!(lastSlashIndex >= 0 && lastSlashIndex < address.length() - 1)) {
            System.err.println("Could not figure out local file name for " + address);
        } else {
            try {
                String localFileName;
                MyHelperClass ZeroFileSettings = new MyHelperClass();
                if (!ZeroFileSettings.getDownloadFolder().equals("")) localFileName = ZeroFileSettings.getDownloadFolder() + "/" + address.substring(lastSlashIndex + 1).replace("%20", " "); else localFileName = System.getProperty("user.home") + "/" + address.substring(lastSlashIndex + 1).replace("%20", " ");
                URL url = new URL(address);
                out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(localFileName));
                conn =(URLConnection)(Object) url.openConnection();
                in =(InputStream)(Object) conn.getInputStream();
                byte[] buffer = new byte[1024];
                int numRead;
                long numWritten = 0;
                while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                    out.write(buffer, 0, numRead);
                    numWritten += numRead;
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (UncheckedIOException ioe) {
                    System.out.println(ioe);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDownloadFolder(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
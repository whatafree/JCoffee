
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22327409 {
public MyHelperClass log(String o0){ return null; }

//    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        PrintWriter writer = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            writer =(PrintWriter)(Object) response.getWriter();
        } catch (UncheckedIOException ex) {
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        }
        String filename =(String)(Object) request.getHeader("X-File-Name");
        try {
            is =(InputStream)(Object) request.getInputStream();
            MyHelperClass targetPath = new MyHelperClass();
            fos = new FileOutputStream(new File(targetPath + filename));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_OK);
            writer.print("{success: true}");
        } catch (UncheckedIOException ex) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                fos.close();
                is.close();
            } catch (UncheckedIOException ignored) {
            }
        }
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass SC_INTERNAL_SERVER_ERROR;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OctetStreamReader {

}

class File {

File(String o0){}
	File(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

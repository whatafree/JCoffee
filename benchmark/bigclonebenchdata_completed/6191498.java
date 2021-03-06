
import java.io.UncheckedIOException;


class c6191498 {

    private static void copySmallFile(final File sourceFile, final File targetFile) throws PtException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("Copying SMALL file '" + sourceFile.getAbsolutePath() + "' to " + "'" + targetFile.getAbsolutePath() + "'.");
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(targetFile).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            throw new PtException("Could not copy file from '" + sourceFile.getAbsolutePath() + "' to " + "'" + targetFile.getAbsolutePath() + "'!",(IOException)(Object) e);
        } finally {
            MyHelperClass PtCloseUtil = new MyHelperClass();
            PtCloseUtil.close(inChannel, outChannel);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass close(FileChannel o0, FileChannel o1){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class PtException extends Exception{
	public PtException(String errorMessage) { super(errorMessage); }
	PtException(){}
	PtException(String o0, IOException o1){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

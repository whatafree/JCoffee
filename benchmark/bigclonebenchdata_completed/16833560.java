
import java.io.UncheckedIOException;


class c16833560 {

    public byte[] loadClassFirst(final String className) {
        if (className.equals("com.sun.sgs.impl.kernel.AppKernelAppContext")) {
            final URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource("com/sun/sgs/impl/kernel/AppKernelAppContext.0.9.5.1.class.bin");
            if (url != null) {
                try {
                    MyHelperClass StreamUtil = new MyHelperClass();
                    return(byte[])(Object) StreamUtil.read(url.openStream());
                } catch (UncheckedIOException e) {
                }
            }
            throw new IllegalStateException("Unable to load AppKernelAppContext.0.9.5.1.class.bin");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

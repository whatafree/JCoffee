
import java.io.UncheckedIOException;


class c20652369 {

    public static void main(String[] args) {
        URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource("org/xul/script/resources/xul.properties");
        try {
            PropertyResourceBundle prb = new PropertyResourceBundle(url.openStream());
            String version =(String)(Object) prb.getString("version");
            String date =(String)(Object) prb.getString("date");
            System.out.println("javaXUL version " + version + " build on " + date);
            System.out.println("Distributed under LGPL license");
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class PropertyResourceBundle {

PropertyResourceBundle(MyHelperClass o0){}
	PropertyResourceBundle(){}
	public MyHelperClass getString(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

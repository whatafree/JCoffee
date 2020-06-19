import java.io.*;
import java.lang.*;
import java.util.*;



class c14193057 {

    public static void writeURLToFile(String url, String path) throws MalformedURLException, IOException {
        java.io.BufferedInputStream in = new java.io.BufferedInputStream(new java.net.URL(url).openStream());
        java.io.FileOutputStream fos = new java.io.FileOutputStream(path);
        java.io.BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
        byte data[] = new byte[1024];
        int count;
        while ((count = in.read(data, 0, 1024)) != -1) {
            ;
            bout.write(data, 0, count);
        }
        bout.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

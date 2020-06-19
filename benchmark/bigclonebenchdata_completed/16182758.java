import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16182758 {

    public Void doInBackground()  throws Throwable {
        MyHelperClass clipboard = new MyHelperClass();
        Transferable clipData =(Transferable)(Object) clipboard.getContents(this);
        MyHelperClass mp3 = new MyHelperClass();
        File file = new File("Videos/" + (mp3.getArtist() + " - " + mp3.getTitle() + ".jpg").replace("/", "").replace("\\", ""));
        try {
            MyHelperClass DataFlavor = new MyHelperClass();
            String test = (String)(String)(Object) (clipData.getTransferData(DataFlavor.stringFlavor));
            String testje = test.toLowerCase();
            if (testje.indexOf(".flv") > 0 || testje.indexOf(".wmv") > 0 || testje.indexOf(".mpg") > 0 || testje.indexOf(".mpeg") > 0 || testje.indexOf(".avi") > 0 || testje.indexOf(".avi") > 0 || testje.indexOf(".divx") > 0 || testje.indexOf(".avi") > 0) {
                URL url = new URL(test);
                (new File("Videos/")).mkdirs();
                System.out.println("Saving video to " + file);
                try {
                    URLConnection urlC = url.openConnection();
                    InputStream is = url.openStream();
                    System.out.flush();
                    FileOutputStream fos = null;
                    fos = new FileOutputStream(file);
                    byte[] buf = new byte[32768];
                    int len;
                    while ((len = is.read(buf)) > 0) {
                        fos.write(buf, 0, len);
                    }
                    is.close();
                    fos.close();
                } catch (Exception e) {
                    System.out.println("Error saving video from url: " + url);
//                    MyHelperClass mp3 = new MyHelperClass();
                    mp3.setVideo(file.getAbsolutePath());
                }
            }
        } catch (Exception ex) {
            System.out.println("not a valid video file");
            ex.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass stringFlavor;
public MyHelperClass setVideo(String o0){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getContents(c16182758 o0){ return null; }
	public MyHelperClass getArtist(){ return null; }}

class Transferable {

public MyHelperClass getTransferData(MyHelperClass o0){ return null; }}

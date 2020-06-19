import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19044532 {
public MyHelperClass Config;
public MyHelperClass endpointURL;
	public MyHelperClass FTPReply;

    public boolean exists(String fileToCheck) throws IOException {
        FTPClient ftp = new FTPClient();
        boolean found = false;
        try {
            int reply = 0;
            ftp.connect(this.endpointURL, Config.getFtpPort());
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new IOException("Ftp exists server refused connection.");
            }
            if (!(Boolean)(Object)ftp.login("anonymous", "")) {
                ftp.logout();
                throw new IOException("FTP: server wrong passwd");
            }
            ftp.enterLocalPassiveMode();
            if (ftp.listNames(fileToCheck) != null) {
                found = true;
            }
            ftp.logout();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
        return found;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFtpPort(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass listNames(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

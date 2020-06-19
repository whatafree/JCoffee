import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22133607 {
public MyHelperClass mErrorExist;
	public MyHelperClass mNewMail;
	public MyHelperClass mNewPrenom;
	public MyHelperClass mNewMdp;
	public MyHelperClass mClient;
	public MyHelperClass errorZone;
	public MyHelperClass mNewAdresse;
	public MyHelperClass mLogger;
	public MyHelperClass mNewMdpConfirm;
	public MyHelperClass mComponentResources;
	public MyHelperClass mClientManager;
	public MyHelperClass mErrorMdp;
	public MyHelperClass mNewNom;

    Object onSuccess() {
        this.mErrorExist =(MyHelperClass)(Object) true;
        this.mErrorMdp =(MyHelperClass)(Object) true;
        if (this.mNewMail.equals(mClient.getEmail()) || !this.mNewMail.equals(mClient.getEmail()) && !(Boolean)(Object)mClientManager.exists(this.mNewMail)) {
            this.mErrorExist =(MyHelperClass)(Object) false;
            if (mNewMdp != null && mNewMdpConfirm != null) {
                if (this.mNewMdp.equals(this.mNewMdpConfirm)) {
                    this.mErrorMdp =(MyHelperClass)(Object) false;
                    MessageDigest sha1Instance;
                    try {
                        sha1Instance = MessageDigest.getInstance("SHA1");
                        sha1Instance.reset();
                        sha1Instance.update((byte)(Object)this.mNewMdp.getBytes());
                        byte[] digest = sha1Instance.digest();
                        BigInteger bigInt = new BigInteger(1, digest);
                        String vHashPassword = bigInt.toString(16);
                        mClient.setMdp(vHashPassword);
                    } catch (NoSuchAlgorithmException e) {
                        mLogger.error(e.getMessage(), e);
                    }
                }
            } else {
                this.mErrorMdp =(MyHelperClass)(Object) false;
            }
            if (!(Boolean)(Object)this.mErrorMdp) {
                mClient.setAdresse(this.mNewAdresse);
                mClient.setEmail(this.mNewMail);
                mClient.setNom(this.mNewNom);
                mClient.setPrenom((this.mNewPrenom != null ? this.mNewPrenom : ""));
                Client vClient = new Client(mClient);
                mClientManager.save(vClient);
                mComponentResources.discardPersistentFieldChanges();
                return "Client/List";
            }
        }
        return errorZone.getBody();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBody(){ return null; }
	public MyHelperClass save(Client o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass setMdp(String o0){ return null; }
	public MyHelperClass discardPersistentFieldChanges(){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass setAdresse(MyHelperClass o0){ return null; }
	public MyHelperClass setEmail(MyHelperClass o0){ return null; }
	public MyHelperClass exists(MyHelperClass o0){ return null; }
	public MyHelperClass setNom(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Client {

Client(MyHelperClass o0){}
	Client(){}}

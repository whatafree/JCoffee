import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3298291 {

    public static String rename_file(String sessionid, String key, String newFileName)  throws Throwable {
        String jsonstring = "";
        try {
            MyHelperClass Log = new MyHelperClass();
            Log.d("current running function name:", "rename_file");
            HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
            HttpPost httppost = new HttpPost("https://mt0-app.cloud.cm/rpc/json");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("c", "Storage"));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("m", "rename_file"));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("new_name", newFileName));
            nameValuePairs.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("key", key));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            httppost.setHeader("Cookie", "PHPSESSID=" + sessionid);
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
            MyHelperClass EntityUtils = new MyHelperClass();
            jsonstring = EntityUtils.toString(response.getEntity());
//            MyHelperClass Log = new MyHelperClass();
            Log.d("jsonStringReturned:", jsonstring);
            return jsonstring;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonstring;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(String o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}

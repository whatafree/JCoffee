import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19758418 {
public static MyHelperClass tools;
	public static MyHelperClass DEBUG;
	public static MyHelperClass Config;
	public static MyHelperClass ERROR;
	public static MyHelperClass getContentLength(String o0){ return null; }
//public MyHelperClass ERROR;
//	public MyHelperClass DEBUG;
//	public MyHelperClass Config;
//	public MyHelperClass tools;
//	public MyHelperClass getContentLength(String o0){ return null; }

    public static String post(String strUrl, String data) throws Throwable, Exception {
        URL url = new URL(strUrl);
        final String method = "POST";
        final String host = url.getHost();
        final String contentType = "application/x-www-form-urlencoded";
        final int contentLength =(int)(Object) getContentLength(data);
        final String encoding = "UTF-8";
        final String connection = "Close";
        Config.log(DEBUG, "Sending data to: " + url + " (host=" + host + ", encoding=" + encoding + ", method=" + method + ", Content-Type=" + contentType + ", Content-Length=" + contentLength + ", Connection=" + connection + "):" + "\r\n" + data);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod(method);
        conn.setRequestProperty("host", host);
        conn.setRequestProperty("content-type", contentType);
        conn.setRequestProperty("Content-Encoding", encoding);
        conn.setRequestProperty("content-length", contentLength + "");
        conn.setRequestProperty("connection", connection);
        if ((Boolean)(Object)tools.valid(Config.JSON_RPC_WEBSERVER_USERNAME) && (Boolean)(Object)tools.valid(Config.JSON_RPC_WEBSERVER_PASSWORD)) {
            String authString = Config.JSON_RPC_WEBSERVER_USERNAME + ":" + Config.JSON_RPC_WEBSERVER_PASSWORD;
            String authStringEnc = new sun.misc.BASE64Encoder().encode(authString.getBytes());
            conn.setRequestProperty("Authorization", "Basic " + authStringEnc);
        }
        conn.setReadTimeout((int) ((int)(Object)Config.JSON_RPC_TIMEOUT_SECONDS * 1000));
        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
        writer.write(data);
        writer.flush();
        writer.close();
        int responseCode = 400;
        try {
            responseCode = conn.getResponseCode();
        } catch (Exception x) {
            Config.log(ERROR, "Failed to get response code from HTTP Server. Check your URL and username/password.", x);
        }
        String response = readStream(responseCode == 200 ? conn.getInputStream() : conn.getErrorStream());
        if (response == null) {
            return null;
        }
        Config.log(DEBUG, "Raw response from POST. Response Code = " + conn.getResponseCode() + " (" + conn.getResponseMessage() + "):\r\n" + response);
        return response.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JSON_RPC_WEBSERVER_PASSWORD;
	public MyHelperClass JSON_RPC_TIMEOUT_SECONDS;
	public MyHelperClass JSON_RPC_WEBSERVER_USERNAME;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass valid(MyHelperClass o0){ return null; }}

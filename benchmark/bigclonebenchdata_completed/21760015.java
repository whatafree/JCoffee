


class c21760015 {

    public static String httpUrlConnection_post(String targetURL, String urlParameters) {
        System.out.println("httpUrlConnection_post");
        URL url;
        HttpURLConnection connection = null;
        try {
            url = new URL(targetURL);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");
            connection.setUseCaches(false);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();
            InputStream is =(InputStream)(Object) connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line =(String)(Object) rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            System.out.print(e);
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}




class c5746450 {

    private String getData(String myurl) throws Exception {
        URL url = new URL(myurl);
        HttpURLConnection uc;// = new HttpURLConnection();
        uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        BufferedReader br;// = new BufferedReader();
        br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String temp = "", k = "";
//        MyHelperClass br = new MyHelperClass();
        while ((temp =(String)(Object) br.readLine()) != null) {
            k += temp;
        }
//        MyHelperClass br = new MyHelperClass();
        br.close();
        return k;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

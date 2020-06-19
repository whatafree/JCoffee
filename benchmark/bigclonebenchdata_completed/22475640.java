import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22475640 {
public MyHelperClass Context;
	public MyHelperClass layout;

//    @Override
    public void onCreate(Bundle savedInstanceState)  throws Throwable {
        this.onCreate(savedInstanceState);
        setContentView(layout.main);
        MyHelperClass mTextView = new MyHelperClass();
        mTextView = (TextView) findViewById(id.textView001);
        MyHelperClass mButton = new MyHelperClass();
        mButton = (Button) findViewById(id.Button001);
        MyHelperClass tm = new MyHelperClass();
        tm = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        msetOnClickListener(new OnClickListener() {

//            @Override
            public void onClick(View v) {
                GsmCellLocation gcl = (GsmCellLocation) tm.getCellLocation();
                int cid = gcl.getCid();
                int lac = gcl.getLac();
                int mcc = Integer.valueOf(tm.getNetworkOperator().substring(0, 3));
                int mnc = Integer.valueOf(tm.getNetworkOperator().substring(3, 5));
                try {
                    JSONObject holder = new JSONObject();
                    holder.put("version", "1.1.0");
                    holder.put("host", "maps.google.com");
                    holder.put("request_address", true);
                    JSONArray array = new JSONArray();
                    JSONObject data = new JSONObject();
                    data.put("cell_id", cid);
                    data.put("location_area_code", lac);
                    data.put("mobile_country_code", mcc);
                    data.put("mobile_network_code", mnc);
                    array.put(data);
                    holder.put("cell_towers", array);
                    DefaultHttpClient client = new DefaultHttpClient();
                    HttpPost post = new HttpPost("http://www.google.com/loc/json");
                    StringEntity se = new StringEntity(holder.toString());
                    post.setEntity(se);
                    HttpResponse resp = client.execute(post);
                    HttpEntity entity = resp.getEntity();
                    BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
                    StringBuffer sb = new StringBuffer();
                    String result = br.readLine();
                    while (result != null) {
                        sb.append(result);
                        result = br.readLine();
                    }
                    JSONObject jsonObject = new JSONObject(sb.toString());
                    JSONObject jsonObject1 = new JSONObject(jsonObject.getString("location"));
                    getAddress(jsonObject1.getString("latitude"), jsonObject1.getString("longitude"));
                } catch (Exception e) {
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Bundle {

}

class TextView {

}

class Button {

}

class TelephonyManager {

}

class OnClickListener {

}

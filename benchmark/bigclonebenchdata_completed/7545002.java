import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7545002 {

    public static String POST(String url, String[][] props) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("POST");
        for (int i = 0; i < props.length; ++i) {
            conn.addRequestProperty(props[i][0], props[i][1]);
        }
        conn.connect();
        try {
            return new String((byte[]) conn.getContent());
        } finally {
            conn.disconnect();
        }
    }

}

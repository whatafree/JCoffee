import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9059012 {

    public static InputStream downloadStream(URL url) {
        InputStream inputStream = null;
        try {
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setFollowRedirects(true);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != HttpURLConnection.HTTP_OK) return null;
            }
            return urlConnection.getInputStream();
        } catch (Exception ex) {
            try {
                inputStream.close();
            } catch (Exception ex1) {
            }
            return null;
        }
    }

}

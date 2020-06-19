import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15700441 {

    private void getViolationsReportBySLATIdYearMonthDay() throws IOException {
        String xmlFile11Send = System.getenv("SLASOI_HOME") + System.getProperty("file.separator") + "Integration" + System.getProperty("file.separator") + "soap" + System.getProperty("file.separator") + "getViolationsReportBySLATIdYearMonthDay.xml";
        URL url11;
        MyHelperClass bmReportingWSUrl = new MyHelperClass();
        url11 = new URL((String)(Object)bmReportingWSUrl);
        URLConnection connection11 = url11.openConnection();
        HttpURLConnection httpConn11 = (HttpURLConnection) connection11;
        FileInputStream fin11 = new FileInputStream(xmlFile11Send);
        ByteArrayOutputStream bout11 = new ByteArrayOutputStream();
        MyHelperClass SOAPClient4XG = new MyHelperClass();
        SOAPClient4XG.copy(fin11, bout11);
        fin11.close();
        byte[] b11 = bout11.toByteArray();
        httpConn11.setRequestProperty("Content-Length", String.valueOf(b11.length));
        httpConn11.setRequestProperty("Content-Type", "application/soap+xml; charset=UTF-8");
        MyHelperClass soapAction = new MyHelperClass();
        httpConn11.setRequestProperty("SOAPAction",(String)(Object) soapAction);
        httpConn11.setRequestMethod("POST");
        httpConn11.setDoOutput(true);
        httpConn11.setDoInput(true);
        OutputStream out11 = httpConn11.getOutputStream();
        out11.write(b11);
        out11.close();
        InputStreamReader isr11 = new InputStreamReader(httpConn11.getInputStream());
        BufferedReader in11 = new BufferedReader(isr11);
        String inputLine11;
        StringBuffer response11 = new StringBuffer();
        while ((inputLine11 = in11.readLine()) != null) {
            response11.append(inputLine11);
        }
        in11.close();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "Component Name: Business Manager\n" + "Interface Name: getReport\n" + "Operation Name: getViolationsReportBySLATIdYearMonthDay\n" + "Input" + "ProductOfferID-1\n" + "PartyID-1\n" + "\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "######################################## RESPONSE" + "############################################\n\n");
        System.out.println("--------------------------------");
        System.out.println("Response\n" + response11.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }}

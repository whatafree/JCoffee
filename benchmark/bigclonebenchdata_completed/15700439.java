import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15700439 {

    private void getViolationsReportByProductOfferIdYearMonthDay() throws IOException {
        String xmlFile9Send = System.getenv("SLASOI_HOME") + System.getProperty("file.separator") + "Integration" + System.getProperty("file.separator") + "soap" + System.getProperty("file.separator") + "getViolationsReportByProductOfferIdYearMonthDay.xml";
        URL url9;
        MyHelperClass bmReportingWSUrl = new MyHelperClass();
        url9 = new URL((String)(Object)bmReportingWSUrl);
        URLConnection connection9 = url9.openConnection();
        HttpURLConnection httpConn9 = (HttpURLConnection) connection9;
        FileInputStream fin9 = new FileInputStream(xmlFile9Send);
        ByteArrayOutputStream bout9 = new ByteArrayOutputStream();
        MyHelperClass SOAPClient4XG = new MyHelperClass();
        SOAPClient4XG.copy(fin9, bout9);
        fin9.close();
        byte[] b9 = bout9.toByteArray();
        httpConn9.setRequestProperty("Content-Length", String.valueOf(b9.length));
        httpConn9.setRequestProperty("Content-Type", "application/soap+xml; charset=UTF-8");
        MyHelperClass soapAction = new MyHelperClass();
        httpConn9.setRequestProperty("SOAPAction",(String)(Object) soapAction);
        httpConn9.setRequestMethod("POST");
        httpConn9.setDoOutput(true);
        httpConn9.setDoInput(true);
        OutputStream out9 = httpConn9.getOutputStream();
        out9.write(b9);
        out9.close();
        InputStreamReader isr9 = new InputStreamReader(httpConn9.getInputStream());
        BufferedReader in9 = new BufferedReader(isr9);
        String inputLine9;
        StringBuffer response9 = new StringBuffer();
        while ((inputLine9 = in9.readLine()) != null) {
            response9.append(inputLine9);
        }
        in9.close();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "Component Name: Business Manager\n" + "Interface Name: getReport\n" + "Operation Name: " + "getViolationsReportByProductOfferIdYearMonthDay\n" + "Input" + "ProductOfferID-1\n" + "PartyID-1\n" + "\n" + "####################################################" + "#################################################\n" + "####################################################" + "#################################################\n" + "######################################## RESPONSE" + "############################################\n\n");
        System.out.println("--------------------------------");
        System.out.println("Response\n" + response9.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }}

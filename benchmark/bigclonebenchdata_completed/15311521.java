


class c15311521 {

    public String buscaCDA() {
        Properties prop =(Properties)(Object) (new CargaProperties().Carga());
        URL url;
        BufferedReader in;
        String inputLine;
        String miLinea = null;
        try {
            url = new URL(prop.getProperty("CDA"));
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                if (inputLine.contains("cda-TRUNK-")) {
                    miLinea = inputLine;
                    miLinea = miLinea.substring(miLinea.indexOf("lastSuccessfulBuild/artifact/dist/cda-TRUNK"));
                    miLinea = miLinea.substring(0, miLinea.indexOf("\">"));
                    miLinea = url + miLinea;
                }
            }
        } catch (Throwable t) {
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("Detetectado last build CDA: " + miLinea);
        return miLinea;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}

class CargaProperties {

public MyHelperClass Carga(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

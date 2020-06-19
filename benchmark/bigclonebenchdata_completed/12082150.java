


class c12082150 {

    public static Set getDatosCatastrales(String pURL) {
        Set result =(Set)(Object) new HashSet();
        String iniCuerr = "<cuerr>";
        String finCuerr = "</cuerr>";
        String iniDesErr = "<des>";
        String finDesErr = "</des>";
        String iniInm1 = "<rcdnp>";
        String finInm1 = "</rcdnp>";
        String iniInm2 = "<bi>";
        String finInm2 = "</bi>";
        String iniPC1 = "<pc1>";
        String iniPC2 = "<pc2>";
        String finPC1 = "</pc1>";
        String finPC2 = "</pc2>";
        String iniCar = "<car>";
        String finCar = "</car>";
        String iniCC1 = "<cc1>";
        String finCC1 = "</cc1>";
        String iniCC2 = "<cc2>";
        String finCC2 = "</cc2>";
        String iniLDT = "<ldt>";
        String iniBq = "<bq>";
        String finBq = "</bq>";
        String iniEs = "<es>";
        String finEs = "</es>";
        String iniPt = "<pt>";
        String finPt = "</pt>";
        String iniPu = "<pu>";
        String finPu = "</pu>";
        boolean error = false;
        int ini, fin;
        int postal = 0;
        try {
            URL url = new URL(pURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) br.readLine()) != null) {
                if (str.contains(iniCuerr)) {
                    ini = str.indexOf(iniCuerr) + iniCuerr.length();
                    fin = str.indexOf(finCuerr);
                    if (Integer.parseInt(str.substring(ini, fin)) > 0) error = true;
                }
                if (error) {
                    if (str.contains(iniDesErr)) {
                        ini = str.indexOf(iniDesErr) + iniDesErr.length();
                        fin = str.indexOf(finDesErr);
                        throw (new Exception(str.substring(ini, fin)));
                    }
                } else {
                    if (str.contains(iniInm1) || str.contains(iniInm2)) {
                        Address inmueble = new Address();
                        while ((str =(String)(Object) br.readLine()) != null && !str.contains(finInm1) && !str.contains(finInm2)) {
                            if (str.contains(iniPC1) && str.contains(finPC1)) {
                                ini = str.indexOf(iniPC1) + iniPC1.length();
                                fin = str.indexOf(finPC1);
                                inmueble.setDescription(str.substring(ini, fin));
                            }
                            if (str.contains(iniPC2) && str.contains(finPC2)) {
                                ini = str.indexOf(iniPC2) + iniPC2.length();
                                fin = str.indexOf(finPC2);
                                inmueble.setDescription((String)(Object)inmueble.getDescription().concat(str.substring(ini, fin)));
                            }
                            if (str.contains(iniLDT) && str.contains("-")) {
                                postal = Integer.parseInt(str.substring(str.lastIndexOf("-") - 5, str.lastIndexOf("-")));
                            }
                            if (str.contains(iniCar) && str.contains(finCar)) {
                                ini = str.indexOf(iniCar) + iniCar.length();
                                fin = str.indexOf(finCar);
                                inmueble.setDescription((String)(Object)inmueble.getDescription().concat(str.substring(ini, fin)));
                            }
                            if (str.contains(iniCC1) && str.contains(finCC1)) {
                                ini = str.indexOf(iniCC1) + iniCC1.length();
                                fin = str.indexOf(finCC1);
                                inmueble.setDescription((String)(Object)inmueble.getDescription().concat(str.substring(ini, fin)));
                            }
                            if (str.contains(iniCC2) && str.contains(finCC2)) {
                                ini = str.indexOf(iniCC2) + iniCC2.length();
                                fin = str.indexOf(finCC2);
                                inmueble.setDescription((String)(Object)inmueble.getDescription().concat(str.substring(ini, fin)));
                            }
                            if (str.contains(iniBq) && str.contains(finBq)) {
                                ini = str.indexOf(iniBq) + iniBq.length();
                                fin = str.indexOf(finBq);
                                inmueble.setBlock(str.substring(ini, fin));
                            }
                            if (str.contains(iniEs) && str.contains(finEs)) {
                                ini = str.indexOf(iniEs) + iniEs.length();
                                fin = str.indexOf(finEs);
                                inmueble.setStairs(str.substring(ini, fin));
                            }
                            if (str.contains(iniPt) && str.contains(finPt)) {
                                ini = str.indexOf(iniPt) + iniPt.length();
                                fin = str.indexOf(finPt);
                                inmueble.setFloor(str.substring(ini, fin));
                            }
                            if (str.contains(iniPu) && str.contains(finPu)) {
                                ini = str.indexOf(iniPu) + iniPu.length();
                                fin = str.indexOf(finPu);
                                inmueble.setDoor(str.substring(ini, fin));
                            }
                        }
                        result.add(inmueble);
                    }
                }
            }
            br.close();
            if ((int)(Object)result.size() == 1) {
                Object ad[] =(Object[])(Object) result.toArray();
                MyHelperClass ConversorCoordenadas = new MyHelperClass();
                Coordinate coord =(Coordinate)(Object) ConversorCoordenadas.getCoordenadas(((Address) ad[0]).getDescription());
                coord.setPostcode(postal);
                for (Address inm :(Address[])(Object) (Object[])(Object)result) inm.setCoodinate(coord);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCoordenadas(MyHelperClass o0){ return null; }
	public MyHelperClass concat(String o0){ return null; }}

class Set {

public MyHelperClass add(Address o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toArray(){ return null; }}

class Address {

public MyHelperClass setBlock(String o0){ return null; }
	public MyHelperClass setCoodinate(Coordinate o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass setDoor(String o0){ return null; }
	public MyHelperClass setFloor(String o0){ return null; }
	public MyHelperClass setStairs(String o0){ return null; }}

class HashSet {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Coordinate {

public MyHelperClass setPostcode(int o0){ return null; }}




class c18748516 {

    public static void copy(String fromFile, String toFile) throws IOException {
        File inputFile = new File(fromFile);
        File outputFile = new File(toFile);
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
